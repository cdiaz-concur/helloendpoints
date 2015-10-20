
package com.concur.gcp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jdo.annotations.Extension;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Build {
	
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    @Extension(vendorName="datanucleus", key="gae.encoded-pk", value="true")	
    private String encodedKey;
	
    @Persistent
    private String id;
	
	@Persistent	
    private List<Artefact> artefacts = new ArrayList<Artefact>();
	
	@Persistent	
    private Integer buildNumber;
	
	@Persistent	
    private List<Change> changes = new ArrayList<Change>();
	
	@Persistent	
    private String commitHash;
	
	@Persistent	
    private String createdAt;
	
	@Persistent	
    private String errorMessage;
	
	@Persistent	
    private String finishedAt;
	
	@Persistent	
    private String startedAt;
	
	@Persistent	
    private String status;
	
	@Persistent	
    private Tests tests;
	
	@Persistent	
    private String version;
	
	@Persistent	
    private String webUrl;
	
	@Persistent	
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


	/**
	 * 
	 * @return
	 */
    public String getEncodedKey() {
		return encodedKey;
	}

    /**
     * 
     * @param key
     */
	public void setEncodedKey(String encodedKey) {
		this.encodedKey = encodedKey;
	}
	
	/**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The artefacts
     */
    public List<Artefact> getArtefacts() {
        return artefacts;
    }

    /**
     * 
     * @param artefacts
     *     The artefacts
     */
    public void setArtefacts(List<Artefact> artefacts) {
        this.artefacts = artefacts;
    }

    /**
     * 
     * @return
     *     The buildNumber
     */
    public Integer getBuildNumber() {
        return buildNumber;
    }

    /**
     * 
     * @param buildNumber
     *     The build_number
     */
    public void setBuildNumber(Integer buildNumber) {
        this.buildNumber = buildNumber;
    }

    /**
     * 
     * @return
     *     The changes
     */
    public List<Change> getChanges() {
        return changes;
    }

    /**
     * 
     * @param changes
     *     The changes
     */
    public void setChanges(List<Change> changes) {
        this.changes = changes;
    }

    /**
     * 
     * @return
     *     The commitHash
     */
    public String getCommitHash() {
        return commitHash;
    }

    /**
     * 
     * @param commitHash
     *     The commit_hash
     */
    public void setCommitHash(String commitHash) {
        this.commitHash = commitHash;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * 
     * @param errorMessage
     *     The error_message
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * 
     * @return
     *     The finishedAt
     */
    public String getFinishedAt() {
        return finishedAt;
    }

    /**
     * 
     * @param finishedAt
     *     The finished_at
     */
    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    /**
     * 
     * @return
     *     The startedAt
     */
    public String getStartedAt() {
        return startedAt;
    }

    /**
     * 
     * @param startedAt
     *     The started_at
     */
    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The tests
     */
    public Tests getTests() {
        return tests;
    }

    /**
     * 
     * @param tests
     *     The tests
     */
    public void setTests(Tests tests) {
        this.tests = tests;
    }

    /**
     * 
     * @return
     *     The version
     */
    public String getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 
     * @return
     *     The webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    /**
     * 
     * @param webUrl
     *     The web_url
     */
    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
