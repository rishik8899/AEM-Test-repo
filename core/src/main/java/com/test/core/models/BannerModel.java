package com.test.core.models;
 
import javax.inject.Inject;
 
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
 
@Model(adaptables = Resource.class)
public class BannerModel {
@Inject
private String title;
@Inject
private String image;
@Inject
private String desc;

public String getTitle() {
return title;
}
public String getImage() {
return image;
}
public String getDesc() {
return desc;
}
 
}