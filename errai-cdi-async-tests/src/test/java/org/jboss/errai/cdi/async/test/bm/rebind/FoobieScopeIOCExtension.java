/*
 * Copyright 2012 JBoss, by Red Hat, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.errai.cdi.async.test.bm.rebind;

import org.jboss.errai.cdi.async.test.bm.client.res.FoobieScope;
import org.jboss.errai.ioc.client.api.IOCExtension;
import org.jboss.errai.ioc.rebind.ioc.bootstrapper.IOCConfigProcessor;
import org.jboss.errai.ioc.rebind.ioc.bootstrapper.IOCProcessingContext;
import org.jboss.errai.ioc.rebind.ioc.extension.IOCExtensionConfigurator;
import org.jboss.errai.ioc.rebind.ioc.injector.api.InjectionContext;
import org.jboss.errai.ioc.rebind.ioc.injector.api.WiringElementType;

/**
 * @author Mike Brock
 */
@IOCExtension
public class FoobieScopeIOCExtension implements IOCExtensionConfigurator {
  @Override
  public void configure(IOCProcessingContext context, InjectionContext injectionContext, IOCConfigProcessor procFactory) {
    injectionContext.mapElementType(WiringElementType.DependentBean, FoobieScope.class);
  }

  @Override
  public void afterInitialization(IOCProcessingContext context, InjectionContext injectionContext, IOCConfigProcessor procFactory) {
  }
}
