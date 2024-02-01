#include <stdio.h>
#include <string.h>
typedef struct
{
    int ID;
    char Name[50];
    char Major[100];
} student_info;
void menu(void)
{
    printf("\n\t\t-------- Menu TO Use--------\n");
    printf("\n\t\t1. Fill Array\n");
    printf("\n\t\t2. View Array Content\n");
    printf("\n\t\t3. Sort Students by Major\n");
    printf("\n\t\t4. To Do next.....\n");
    printf("\n\t\t5. QUIT\n");
    printf("\n\t\t---------------------------\n");
    printf("\n\t\tYour choice:");
}
void fill_array(FILE *fptr, student_info students[], int *l, char line[50])
{
    char temp;
    int i = 0;
    while (!feof(fptr))
    {
        fscanf(fptr, "%d\n", &students[i].ID);

        fgets(students[i].Name, 50, fptr);

        fgets(students[i].Major, 100, fptr);

        fgets(line, 50, fptr);

        i++;
    }
    *l = i;
}
void display_array(student_info students[], int l, char line[])
{
    printf("%d\n", l);
    for (int i = 0; i < l; i++)
        printf("%d\n%s%s%s\n", students[i].ID, students[i].Name, students[i].Major, line);
}
void sort_array(student_info students[], int l)
{
    char temp[100], temp2[100];
    int temp1;
    for (int i = 0; i < l - 1; i++)
    {
        int min = i;
        for (int j = i + 1; j < l; j++)
        {
            if (strcmp(students[min].Major, students[j].Major) > 0)
                min = j;
        }
        if (min != i)
        {

            strcpy(temp, students[i].Major);
            strcpy(students[i].Major, students[min].Major);
            strcpy(students[min].Major, temp);
            temp1 = students[i].ID;
            students[i].ID = students[min].ID;
            students[min].ID = temp1;
            strcpy(temp2, students[min].Name);
            strcpy(students[i].Name, students[min].Name);
            strcpy(students[min].Name, temp2);
        }
        else
            break;
    }
}

void write_files(student_info students[], int l, char line[])
{
    FILE *file1, *file2, *file3, *file4, *file5, *file6;
    file1 = fopen("computercience.txt", "w");
    file2 = fopen("bigdata.txt", "w");
    file3 = fopen("ai.txt", "w");
    file4 = fopen("ems.txt", "w");
    file5 = fopen("cloud.txt", "w");
    file6 = fopen("generale.txt", "w");
    char cs1[100] = "Computer Science\n";
    char bd1[100] = "Big Data Analytics\n";
    char ai1[100] = "Artificial Intelligence & Robotization\n";
    char cl1[100] = "Cloud & Mobile Software Engineering\n";
    char ems1[100] = "Engineering and Management Science\n";
    char ge1[100] = "General Engineering\n";

    for (int i = 0; i < l; i++)
    {

        if (strcmp(students[i].Major, cs1) == 0)
            fprintf(file1, "%d\n%s%s", students[i].ID, students[i].Name, line);
        else if (strcmp(students[i].Major, bd1) == 0)
            fprintf(file2, "%d\n%s%s", students[i].ID, students[i].Name, line);
        else if (strcmp(students[i].Major, ai1) == 0)
            fprintf(file3, "%d\n%s%s", students[i].ID, students[i].Name, line);
        else if (strcmp(students[i].Major, ems1) == 0)
            fprintf(file4, "%d\n%s%s", students[i].ID, students[i].Name, line);
        else if (strcmp(students[i].Major, cl1) == 0)
            fprintf(file5, "%d\n%s%s", students[i].ID, students[i].Name, line);
        else if (strcmp(students[i].Major, ge1) == 0)
            fprintf(file6, "%d\n%s%s", students[i].ID, students[i].Name, line);
    }
}
int main(void)
{

    FILE *stu, *file1, *file2, *file3, *file4, *file5, *file6;
    stu = fopen("Students_Data.txt", "r");
    int choice, l;
    student_info student_array[30];
    char line[50];
    char majores[100];

    do
    {
        menu();
        scanf("%d", &choice);
        switch (choice)
        {

        case 1:
            fill_array(stu, student_array, &l, line);
            fclose(stu);
            break;
        case 2:
            display_array(student_array, l, line);
            break;
        case 3:

            sort_array(student_array, l);

            break;
        case 4:

            write_files(student_array, l, line);

            break;
        case 5:

            printf("\n\t\tTake care!\n\n\t\t");
            break;
        default:
            printf("\n\t\tSorry That was an INVALID Choice!\n");
        }
    } while (choice != 5);
}
