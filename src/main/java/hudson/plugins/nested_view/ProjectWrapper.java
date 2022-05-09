package hudson.plugins.nested_view;

import java.util.Optional;

import hudson.model.AbstractProject;

public class ProjectWrapper {

    private final Optional<AbstractProject> project;

    public ProjectWrapper(Optional<AbstractProject> project) {
        this.project = project;
    }

    public String getHello(){
        if (project.isPresent()){
            return "" + project.get()._getRuns().size();
        } else {
            return "N/A";
        }
    }
}
