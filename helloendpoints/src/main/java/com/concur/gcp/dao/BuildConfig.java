
package com.concur.gcp.dao;

import java.util.HashMap;
import java.util.Map;

import javax.jdo.annotations.Extension;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class BuildConfig {
	
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    @Extension(vendorName="datanucleus", key="gae.encoded-pk", value="true")	
    private String encodedKey;
	
    @Persistent
    private String id;
	
	@Persistent	
    private String branch;
	
	@Persistent	
    private String projectFile;
	
	@Persistent
    private String target;
	
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
     *     The branch
     */
    public String getBranch() {
        return branch;
    }

    /**
     * 
     * @param branch
     *     The branch
     */
    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * 
     * @return
     *     The projectFile
     */
    public String getProjectFile() {
        return projectFile;
    }

    /**
     * 
     * @param projectFile
     *     The project_file
     */
    public void setProjectFile(String projectFile) {
        this.projectFile = projectFile;
    }

    /**
     * 
     * @return
     *     The target
     */
    public String getTarget() {
        return target;
    }

    /**
     * 
     * @param target
     *     The target
     */
    public void setTarget(String target) {
        this.target = target;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
