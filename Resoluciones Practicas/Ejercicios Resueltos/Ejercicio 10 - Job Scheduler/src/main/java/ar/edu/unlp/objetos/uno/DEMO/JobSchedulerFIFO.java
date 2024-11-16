package ar.edu.unlp.objetos.uno.DEMO;
public class JobSchedulerFIFO extends JobScheduler {
    public JobDescription next() {
		JobDescription nextJob = null;
		if (this.jobs != null) {
			nextJob = this.jobs.get(0);
			this.unschedule(nextJob);
			return nextJob;
		}
		return null;
	}
}
