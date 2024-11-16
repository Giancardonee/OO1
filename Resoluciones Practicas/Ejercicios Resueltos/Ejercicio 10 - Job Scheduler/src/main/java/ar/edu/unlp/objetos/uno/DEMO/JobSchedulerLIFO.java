package ar.edu.unlp.objetos.uno.DEMO;
public class JobSchedulerLIFO extends JobScheduler {
    	public JobDescription next() {
		JobDescription nextJob = null;
		if (this.jobs != null) {
			nextJob = jobs.get(jobs.size() - 1);
			this.unschedule(nextJob);
			return nextJob;
		}
		return null;
	}
}
