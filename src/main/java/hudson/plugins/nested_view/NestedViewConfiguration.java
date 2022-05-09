package hudson.plugins.nested_view;

import org.kohsuke.stapler.StaplerRequest;

import jenkins.model.GlobalConfiguration;

import net.sf.json.JSONObject;




public class NestedViewConfiguration extends GlobalConfiguration {
    private boolean searchOn = false;

    @Override
    public boolean configure(StaplerRequest staplerRequest, JSONObject json) throws FormException {
        searchOn = json.optBoolean("searchOn", false);
        return super.configure(staplerRequest, json);
    }

    public boolean getSearchOn() {
        return searchOn;
    }

    public boolean isSearchOn() {
        return searchOn;
    }
}
