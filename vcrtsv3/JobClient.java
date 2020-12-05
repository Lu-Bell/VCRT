package vcrtsv3;

public class JobClient {
	
	/*Creates a new client */
	private int clientID;
	private Job aJob; 
	private int deadline;
	private int[] jobclient;
	private Job[] job;
		
	public JobClient (int clientID, Job aJob, int deadline)
	{
		jobclient = new int[]
				{
		this.clientID = clientID, this.deadline = deadline
				};
		job = new Job[]{
		this.aJob = new Job()
		};
	}

	/* needs methods. I tried my best to kinda follow what he did on the bank account
	it uses the file writing in the code so we should try that instead of doing it in the JFrame
	same goes for the owner class. The only class I think we're missing is the VC class which should probably have 2 queues, one for jobs and one for cars
	*/
	
	//Set Client ID
	public void setClientID(int clientID)
	{
		this.clientID = clientID;
	}
	//Get Client ID
	public int getClientID()
	{
		return this.clientID;
	}
	
	//Set Deadline
	public void setDeadline(int deadline)
	{
		this.deadline = deadline;
	}
	//Set Deadline
	public int getDeadline()
	{
		return this.deadline;
	}
	
	//Set Job
	public void setJob(Job aJob)
	{
		this.aJob = aJob;
	}
	
	public Job getJob()
	{
		return this.aJob;
	}

	

}