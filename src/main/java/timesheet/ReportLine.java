package timesheet;

//Feladat ábrájában és leírásában "RiportLine" szerepel, tesztben "ReportLine" - ReportLine választása

public class ReportLine {
    Project project;
    long time;

    public ReportLine(Project project, long time) {
        this.project = project;
        this.time = time;
    }

    public void addTime(long hoursToBeAdded){
        this.time = this.getTime() + hoursToBeAdded;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
