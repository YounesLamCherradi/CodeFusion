package POST;

public enum Skills {

	NETWORKS(5),DATA_SCIENCE(4),LEADERSHIP(5),MACHINE_LEARNING(3),HACKING(2),WEB_DEVELOPMENT(1),PYTHON(2);
	// If we do not want to change the skill value of the constructor , we can use final keyword to avoid change it
	public int skill;
	
	private Skills(int skill){
		this.skill=skill;
	}

}
