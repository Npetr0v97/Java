package sample;

public class Task {

    private String assignee;
    private String projectName;
    private String issueType;
    private String projectKey;
    private final String issueKey;
    private static int id = 1;
    private String summary;
    private String description;
    private String dueDate;

    public Task(String assignee, String projectName, String issueType, String summary, String description, String dueDate) {
        this.assignee = assignee;
        this.projectName = projectName;

        switch (projectName) {

            case "Service desk":
                this.projectKey = "SC";
                this.issueKey = this.projectKey+ "-" + id;
                id++;
                break;
            case "BI Support":
                this.projectKey = "BI";
                this.issueKey = this.projectKey+ "-" + id;
                id++;
                break;
            case "Business processes":
                this.projectKey = "IMPR";
                this.issueKey = this.projectKey+ "-" + id;
                id++;
                break;
            case "Monitoring":
                this.projectKey = "EM";
                this.issueKey = this.projectKey+ "-" + id;
                id++;
                break;
            default:
                this.projectKey = "XX";
                this.issueKey = this.projectKey + "-" + id;
                id++;
                break;
        }
        this.issueType = issueType;
        this.projectKey = projectKey;
        this.summary = summary;
        this.description = description;
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "assignee='" + assignee + '\'' +
                ", projectName='" + projectName + '\'' +
                ", issueType='" + issueType + '\'' +
                ", projectKey='" + projectKey + '\'' +
                ", issueKey='" + issueKey + '\'' +
                ", summary='" + summary + '\'' +
                ", description='" + description + '\'' +
                ", dueDate='" + dueDate + '\'' +
                '}';
    }


    public String getDueDate() {
        return dueDate;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getIssueType() {
        return issueType;
    }

    public String getProjectKey() {
        return projectKey;
    }

    public String getIssueKey() {
        return issueKey;
    }

    public static int getId() {
        return id;
    }

    public String getSummary() {
        return summary;
    }

    public String getDescription() {
        return description;
    }
}
