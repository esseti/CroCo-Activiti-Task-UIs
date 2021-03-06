package org.crowdcomputer.ui.tactic;

import org.activiti.designer.integration.servicetask.AbstractCustomServiceTask;
import org.activiti.designer.integration.servicetask.PropertyType;
import org.activiti.designer.integration.servicetask.annotation.Help;
import org.activiti.designer.integration.servicetask.annotation.Property;
import org.activiti.designer.integration.servicetask.annotation.Runtime;

@Runtime(javaDelegateClass = "org.crowdcomputer.impl.tactic.QualitySet")
@Help(displayHelpShort = "Set the quality of an instance", displayHelpLong = "Set the quality of an instance")
public class QualiytSet extends AbstractCustomServiceTask {

	// Long process: taken from variable
	// String title: taken from task def

    @Property(type = PropertyType.TEXT, displayName = "quality",required =  true, defaultValue="0")
    @Help(displayHelpShort = "quality value", displayHelpLong ="if empty will load data from input field")
    private String quality;


    @Property(type = PropertyType.TEXT, displayName = "Input data name", required =  true, defaultValue="data")
    @Help(displayHelpShort = "Input data name", displayHelpLong = "Input data name")
    private String input;

    @Property(type = PropertyType.TEXT, displayName = "Output data name", required =  true, defaultValue="data")
    @Help(displayHelpShort = "Output data name", displayHelpLong = "Output data name")
    private String output;

    @Property(type = PropertyType.TEXT, displayName = "Input data execution variable name", required =  true, defaultValue="execution")
    @Help(displayHelpShort = "Input data execution variable name", displayHelpLong = "Input data variable name")
    private String input_execution;

    @Property(type = PropertyType.TEXT, displayName = "Ouput data execution variable name", required =  true, defaultValue="execution")
    @Help(displayHelpShort = "Output data execution variable name", displayHelpLong = "Output data execution variable name")
    private String output_execution;


    @Override
	public String getName() {
		return "Quality set";
	}
	
	@Override
	public String getSmallIconPath() {
		// This is the icon of the component
		// remember that it is mandatory to provide one.
		return "icons/cc.png";
	}

	@Override
	  public String contributeToPaletteDrawer() {
	    return "BPMN4Crowd Validation and Reward";
	  }


}
