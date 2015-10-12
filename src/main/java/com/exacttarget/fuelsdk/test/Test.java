package com.exacttarget.fuelsdk.test;

import com.exacttarget.fuelsdk.ETClient;
import com.exacttarget.fuelsdk.ETFolder;
import com.exacttarget.fuelsdk.ETResponse;
import com.exacttarget.fuelsdk.ETSdkException;

public class Test {
    public static void main(String[] args)
        throws ETSdkException
    {
        ETClient client = new ETClient();
        ETResponse<ETFolder> response = client.retrieve(ETFolder.class);
        for (ETFolder folder : response.getObjects()) {
            System.out.println(folder);
        }
    }
}
