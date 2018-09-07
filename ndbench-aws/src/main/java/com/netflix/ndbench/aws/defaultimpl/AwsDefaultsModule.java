/**
 * Copyright (c) 2018 Netflix, Inc.  All rights reserved.
 */
package com.netflix.ndbench.aws.defaultimpl;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.google.inject.AbstractModule;
import com.netflix.ndbench.api.plugin.annotations.NdBenchClientPluginGuiceModule;
import com.netflix.ndbench.aws.config.NdbenchAWSCredentialProvider;

/**
 * This Module binds implementations to AWS specific default implementations available in this project
 * @author vchella
 */
@NdBenchClientPluginGuiceModule
public class AwsDefaultsModule extends AbstractModule
{
    @Override
    protected void configure()
    {
        bind(AWSCredentialsProvider.class).to(NdbenchAWSCredentialProvider.class);
    }
}
