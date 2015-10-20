
package com.concur.gcp.dao;

import java.util.HashMap;
import java.util.Map;

import javax.jdo.annotations.Extension;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class WebhookBean {

	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    @Extension(vendorName="datanucleus", key="gae.encoded-pk", value="true")	
    private String encodedKey;

	@Persistent
    @Extension(vendorName="datanucleus", key="gae.pk-name", value="true")
    private String keyName;	
	
	@Persistent
	private Project project;
	
	@Persistent
    private BuildConfig buildConfig;
	
	@Persistent
    private Build build;
	
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
	 * @return the keyName
	 */
	public String getKeyName() {
		return keyName;
	}

	/**
	 * @param keyName the keyName to set
	 */
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	/**
     * 
     * @return
     *     The project
     */
    public Project getProject() {
        return project;
    }

    /**
     * 
     * @param project
     *     The project
     */
    public void setProject(Project project) {
        this.project = project;
    }

    /**
     * 
     * @return
     *     The buildConfig
     */
    public BuildConfig getBuildConfig() {
        return buildConfig;
    }

    /**
     * 
     * @param buildConfig
     *     The build_config
     */
    public void setBuildConfig(BuildConfig buildConfig) {
        this.buildConfig = buildConfig;
    }

    /**
     * 
     * @return
     *     The build
     */
    public Build getBuild() {
        return build;
    }

    /**
     * 
     * @param build
     *     The build
     */
    public void setBuild(Build build) {
        this.build = build;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
   
}
