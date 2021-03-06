package com.checkmarx.sonar.cxpropfiles;

import com.checkmarx.sonar.cxrules.CXProgrammingLanguage;
import org.sonar.api.profiles.ProfileDefinition;
import org.sonar.api.profiles.RulesProfile;
import org.sonar.api.profiles.XMLProfileParser;
import org.sonar.api.utils.ValidationMessages;

/**
 * Created by: zoharby.
 * Date: 03/10/2017.
 */
public class CxGroovyProfile extends ProfileDefinition {

    private final XMLProfileParser xmlProfileParser;

    public CxGroovyProfile(XMLProfileParser xmlProfileParser) {
        this.xmlProfileParser = xmlProfileParser;
    }

    @Override
    public RulesProfile createProfile(ValidationMessages validation) {
        return xmlProfileParser.parseResource(getClass().getClassLoader(),
                String.format(CxProfilesConstants.PROFILE_PATH_TEMPLATE,
                        CXProgrammingLanguage.GROOVY.getName().toLowerCase()), validation);
    }
}

