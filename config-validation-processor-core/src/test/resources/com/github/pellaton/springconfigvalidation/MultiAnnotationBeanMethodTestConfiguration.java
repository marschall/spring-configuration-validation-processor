/*
 * *****************************************************************************************************************
 * Copyright 2012 Michael Pellaton
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
 * the specific language governing permissions and limitations under the License.
 *
 * Contributors:
 *   Michael Pellaton
 * *****************************************************************************************************************
 */
package ch.contrails.springconfigvalidation;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Valid {@code @Configuration} class having a @Bean metho that bears other annotations besides the @Bean annotation.  
 * 
 * @author Michael Pellaton
 * @see SpringConfigurationValidationProcessor
 */
@Configuration
public abstract class MultiAnnotationBeanMethodTestConfiguration {
 
  @Bean
  @Primary
  public String someString() {
    return "HELLO JUNIT";
  }
}
