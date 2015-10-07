/**
 * (C) Copyright IBM Corporation 2015.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.wasdev.wlp.ant.servertasks;

import org.apache.tools.ant.BuildException;

import net.wasdev.wlp.ant.ServerTask;

public class ServerStart extends ServerTask {
    @Override
    public void execute() {
        initTask();
        setOperation("start");
        try {
            doStart();
        } catch (Exception e) {
            throw new BuildException(e);
        }
    }
}
