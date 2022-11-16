package com.blogsite.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ResourcePath;

import java.util.Iterator;

@Model(adaptables = Resource.class)
public class GetResource {

    @ResourcePath(path ="/content/my-options/")
    Resource resource;

    public String getResourceText()
    {
        return resource.getName();
    }
    public Iterator<Resource> getResourceChildren()
    {
        return resource.listChildren();
    }
}
