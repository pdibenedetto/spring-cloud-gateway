/*
 * Copyright 2013-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.gateway.server.mvc.filter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.cloud.gateway.server.mvc.common.BeanFactoryGatewayDiscoverer;
import org.springframework.web.servlet.function.HandlerFilterFunction;

public class FilterBeanFactoryDiscoverer extends BeanFactoryGatewayDiscoverer {

	protected FilterBeanFactoryDiscoverer(BeanFactory beanFactory) {
		super(beanFactory);
	}

	@Override
	public void discover() {
		doDiscover(FilterSupplier.class, HandlerFilterFunction.class);
	}

}
