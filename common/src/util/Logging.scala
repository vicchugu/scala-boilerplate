/*
 * Copyright 2011-2017 Marconi Lanna
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
package project.util

import com.typesafe.scalalogging.{Logger, StrictLogging}

trait Logging extends StrictLogging

object Logging {
  private val msg = "exception:"

  implicit class LoggerOps(val logger: Logger) extends AnyVal {
    def error(e: => Throwable): Unit = logger.error(msg, e)
    def warn(e: => Throwable): Unit = logger.warn(msg, e)
    def info(e: => Throwable): Unit = logger.info(msg, e)
    def debug(e: => Throwable): Unit = logger.debug(msg, e)
    def trace(e: => Throwable): Unit = logger.trace(msg, e)
  }
}
