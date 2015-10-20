
package com.concur.gcp.dao;

import java.util.HashMap;
import java.util.Map;

import javax.jdo.annotations.Extension;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Tests {
	
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    @Extension(vendorName="datanucleus", key="gae.encoded-pk", value="true")	
    private String encodedKey;
	
	@Persistent
    private Integer errors;
	
	@Persistent
    private Integer failed;
	
	@Persistent
    private Integer passed;
	
	@Persistent
    private Integer skipped;
	
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
     *     The errors
     */
    public Integer getErrors() {
        return errors;
    }

    /**
     * 
     * @param errors
     *     The errors
     */
    public void setErrors(Integer errors) {
        this.errors = errors;
    }

    /**
     * 
     * @return
     *     The failed
     */
    public Integer getFailed() {
        return failed;
    }

    /**
     * 
     * @param failed
     *     The failed
     */
    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    /**
     * 
     * @return
     *     The passed
     */
    public Integer getPassed() {
        return passed;
    }

    /**
     * 
     * @param passed
     *     The passed
     */
    public void setPassed(Integer passed) {
        this.passed = passed;
    }

    /**
     * 
     * @return
     *     The skipped
     */
    public Integer getSkipped() {
        return skipped;
    }

    /**
     * 
     * @param skipped
     *     The skipped
     */
    public void setSkipped(Integer skipped) {
        this.skipped = skipped;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
