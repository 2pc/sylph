/*
 * Copyright (C) 2018 The Sylph Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ideal.sylph.spi.job;

import javax.validation.constraints.NotNull;

import java.util.Optional;

/**
 * Job Container
 */
public interface JobContainer
{
    /**
     * 当前正在运行的app id
     */
    @NotNull
    String getRunId();

    /**
     * online job
     *
     * @return runApp id
     */
    @NotNull
    Optional<String> run()
            throws Exception;

    /**
     * offline job
     */
    void shutdown();

    /**
     * 获取job的状态
     */
    @NotNull
    Job.Status getStatus();

    void setStatus(Job.Status status);

    /**
     * get app run web url
     */
    String getJobUrl();
}
