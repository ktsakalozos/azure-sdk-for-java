// 
// Copyright (c) Microsoft and contributors.  All rights reserved.
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//   http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// 
// See the License for the specific language governing permissions and
// limitations under the License.
// 

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.websites.models;

import com.microsoft.windowsazure.management.OperationResponse;
import java.util.ArrayList;
import java.util.Iterator;

/**
* The List Web Spaces operation response.
*/
public class WebSpacesListResponse extends OperationResponse implements Iterable<WebSpacesListResponse.WebSpace>
{
    private ArrayList<WebSpacesListResponse.WebSpace> webSpaces;
    
    /**
    * The web spaces associated with the specified subscription.
    */
    public ArrayList<WebSpacesListResponse.WebSpace> getWebSpaces() { return this.webSpaces; }
    
    /**
    * The web spaces associated with the specified subscription.
    */
    public void setWebSpaces(ArrayList<WebSpacesListResponse.WebSpace> webSpaces) { this.webSpaces = webSpaces; }
    
    /**
    * Initializes a new instance of the WebSpacesListResponse class.
    *
    */
    public WebSpacesListResponse()
    {
        this.webSpaces = new ArrayList<WebSpacesListResponse.WebSpace>();
    }
    
    /**
    * Gets the sequence of WebSpaces.
    *
    */
    public Iterator<WebSpacesListResponse.WebSpace> iterator()
    {
        return this.getWebSpaces().iterator();
    }
    
    /**
    * A web space associated with the specified subscription.
    */
    public static class WebSpace
    {
        private WebSpaceAvailabilityState availabilityState;
        
        /**
        * Possible values are Normal or Limited.
        */
        public WebSpaceAvailabilityState getAvailabilityState() { return this.availabilityState; }
        
        /**
        * Possible values are Normal or Limited.
        */
        public void setAvailabilityState(WebSpaceAvailabilityState availabilityState) { this.availabilityState = availabilityState; }
        
        private Integer currentNumberOfWorkers;
        
        /**
        * The current number of workers.
        */
        public Integer getCurrentNumberOfWorkers() { return this.currentNumberOfWorkers; }
        
        /**
        * The current number of workers.
        */
        public void setCurrentNumberOfWorkers(Integer currentNumberOfWorkers) { this.currentNumberOfWorkers = currentNumberOfWorkers; }
        
        private WebSpaceWorkerSize currentWorkerSize;
        
        /**
        * The current worker size. Possible values are Small, Medium, or Large.
        */
        public WebSpaceWorkerSize getCurrentWorkerSize() { return this.currentWorkerSize; }
        
        /**
        * The current worker size. Possible values are Small, Medium, or Large.
        */
        public void setCurrentWorkerSize(WebSpaceWorkerSize currentWorkerSize) { this.currentWorkerSize = currentWorkerSize; }
        
        private String geoLocation;
        
        /**
        * The location of the datacenter for the web space.
        */
        public String getGeoLocation() { return this.geoLocation; }
        
        /**
        * The location of the datacenter for the web space.
        */
        public void setGeoLocation(String geoLocation) { this.geoLocation = geoLocation; }
        
        private String geoRegion;
        
        /**
        * The geographical region where the webspace is located.
        */
        public String getGeoRegion() { return this.geoRegion; }
        
        /**
        * The geographical region where the webspace is located.
        */
        public void setGeoRegion(String geoRegion) { this.geoRegion = geoRegion; }
        
        private String name;
        
        /**
        * The name of the webspace.
        */
        public String getName() { return this.name; }
        
        /**
        * The name of the webspace.
        */
        public void setName(String name) { this.name = name; }
        
        private String plan;
        
        /**
        * The name of the webspace.
        */
        public String getPlan() { return this.plan; }
        
        /**
        * The name of the webspace.
        */
        public void setPlan(String plan) { this.plan = plan; }
        
        private WebSpaceStatus status;
        
        /**
        * The status of the Web Space. Possible values are Ready or Limited.
        * Note: The Limited status occurs only if the datacenter is
        * encountering an operational issue.
        */
        public WebSpaceStatus getStatus() { return this.status; }
        
        /**
        * The status of the Web Space. Possible values are Ready or Limited.
        * Note: The Limited status occurs only if the datacenter is
        * encountering an operational issue.
        */
        public void setStatus(WebSpaceStatus status) { this.status = status; }
        
        private String subscription;
        
        /**
        * The subscription ID.
        */
        public String getSubscription() { return this.subscription; }
        
        /**
        * The subscription ID.
        */
        public void setSubscription(String subscription) { this.subscription = subscription; }
        
        private WebSpaceWorkerSize workerSize;
        
        /**
        * The worker size. Possible values are Small, Medium, and Large. For
        * JSON, the equivalents are 0 = Small, 1 = Medium, 2 = Large.
        */
        public WebSpaceWorkerSize getWorkerSize() { return this.workerSize; }
        
        /**
        * The worker size. Possible values are Small, Medium, and Large. For
        * JSON, the equivalents are 0 = Small, 1 = Medium, 2 = Large.
        */
        public void setWorkerSize(WebSpaceWorkerSize workerSize) { this.workerSize = workerSize; }
        
        /**
        * Initializes a new instance of the WebSpace class.
        *
        */
        public WebSpace()
        {
        }
    }
}
