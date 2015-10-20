/**
 * 
 */
package com.concur.gcp;

import javax.inject.Named;
import javax.jdo.PersistenceManager;

import com.concur.gcp.dao.WebhookBean;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

/**
 * @author Chris N. Diaz
 *
 */
@Api(
	name = "greenhouse",
	version = "v1")
//	clientIds = {Constants.WEB_CLIENT_ID})
public class GreenhouseWebhook {

	
//	 @ApiMethod(name = "ci.message", httpMethod = "get")
//	 public WebhookBean getFoo(@Named("message") String message) {
//		 WebhookBean bean = new WebhookBean();
//		 Project project = new Project();
//		 project.setId("123");
//		 project.setName(message);
//		 project.setPlatform("Android");
//		 project.setWebUrl("http://google.com");
//		 
//		 bean.setProject(project);
//		 
//		 return bean;
//	 }
	 
	 @ApiMethod(name = "ci.message", httpMethod = "get")
	 public WebhookBean getNotification(@Named("name") String name) {
		 
		 PersistenceManager pm = PMF.get().getPersistenceManager();
		 try {
			 
			 Key k = KeyFactory.createKey(WebhookBean.class.getSimpleName(), name);			 
			 WebhookBean bean = pm.getObjectById(WebhookBean.class, k);
			 
			 return bean;
			 
		 } catch (Exception e) {
			 e.printStackTrace();
		 } finally {
			 pm.close();
		 }
		 
		 return new WebhookBean();
	 }	 
	 
	 
	 @ApiMethod(name = "ci.notify", httpMethod = "post")
	 public WebhookBean insertNotification(@Named("id") Integer id, WebhookBean bean) {

		 PersistenceManager pm = PMF.get().getPersistenceManager();
		 try {

			 pm.makePersistent(bean);
			 
		 } catch (Exception e) {
			 e.printStackTrace();
		 } finally {
			 pm.close();
		 }

		 return bean;
	 }
}
