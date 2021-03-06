package com.checkmarx.sonar.cxportalservice.osa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author tsahi
 * @since 02/02/16
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetOpenSourceSummaryResponse {
    @JsonProperty("nonVulnerableLibraries")
    private Integer noKnownVulnerabilities;
    @JsonProperty("vulnerableAndUpdated")
    private Integer vulnerableAndUpdate;
    @JsonProperty("vulnerableAndOutdated")
    private Integer vulnerableAndOutdated;
    @JsonProperty("totalLibraries")
    private Integer totalLibreries;
    @JsonProperty("highVulnerabilityLibraries")
    private Integer highVulnerabilityLibraries;
    @JsonProperty("mediumVulnerabilityLibraries")
    private Integer mediumVulnerabilityLibraries;
    @JsonProperty("lowVulnerabilityLibraries")
    private Integer lowVulnerabilityLibraries;
    @JsonProperty("vulnerabilityScore")
    private String vulnerabilityScore;
    @JsonProperty("totalHighVulnerabilities")
    private Integer highVulnerabilities;
    @JsonProperty("totalMediumVulnerabilities")
    private Integer mediumVulnerabilities;
    @JsonProperty("totalLowVulnerabilities")
    private Integer lowVulnerabilities;


    public int getHighCount() {
        return highVulnerabilities;
    }
    public int getMediumCount() {
        return mediumVulnerabilities;
    }

    public int getLowCount() {
        return lowVulnerabilities;
    }

    public Integer getNoKnownVulnerabilities() {
        return noKnownVulnerabilities;
    }

    public void setNoKnownVulnerabilities(Integer noKnownVulnerabilities) {
        this.noKnownVulnerabilities = noKnownVulnerabilities;
    }

    public Integer getVulnerableAndUpdate() {
        return vulnerableAndUpdate;
    }

    public void setVulnerableAndUpdate(Integer vulnerableAndUpdate) {
        this.vulnerableAndUpdate = vulnerableAndUpdate;
    }

    public Integer getVulnerableAndOutdated() {
        return vulnerableAndOutdated;
    }

    public void setVulnerableAndOutdated(Integer vulnerableAndOutdated) {
        this.vulnerableAndOutdated = vulnerableAndOutdated;
    }

    public Integer getTotalLibreries() {
        return totalLibreries;
    }

    public void setTotalLibreries(Integer totalLibreries) {
        this.totalLibreries = totalLibreries;
    }

    public Integer getHighVulnerabilityLibraries() {
        return highVulnerabilityLibraries;
    }

    public void setHighVulnerabilityLibraries(Integer highVulnerabilityLibraries) {
        this.highVulnerabilityLibraries = highVulnerabilityLibraries;
    }

    public Integer getMediumVulnerabilityLibraries() {
        return mediumVulnerabilityLibraries;
    }

    public void setMediumVulnerabilityLibraries(Integer mediumVulnerabilityLibraries) {
        this.mediumVulnerabilityLibraries = mediumVulnerabilityLibraries;
    }

    public String getVulnerabilityScore()
    {
        return vulnerabilityScore;
    }

    public Integer getHighVulnerabilities()
    {
        return highVulnerabilities;
    }

    public void setHighVulnerabilities(Integer highVulnerabilities) {
        this.highVulnerabilities = highVulnerabilities;
    }

    public Integer getMediumVulnerabilities()
    {
        return mediumVulnerabilities;
    }

    public void setMediumVulnerabilities(Integer mediumVulnerabilities) {
        this.mediumVulnerabilities = mediumVulnerabilities;
    }

    public Integer getLowVulnerabilities()
    {
        return lowVulnerabilities;
    }

    public void setLowVulnerabilities(Integer lowVulnerabilities) {
        this.lowVulnerabilities = lowVulnerabilities;
    }

    public Integer getLowVulnerabilityLibraries() {
        return lowVulnerabilityLibraries;
    }

    public void setLowVulnerabilityLibraries(Integer lowVulnerabilityLibraries) {
        this.lowVulnerabilityLibraries = lowVulnerabilityLibraries;
    }

    public void setVulnerabilityScore(String vulnerabilityScore) {
        this.vulnerabilityScore = vulnerabilityScore;
    }
}
