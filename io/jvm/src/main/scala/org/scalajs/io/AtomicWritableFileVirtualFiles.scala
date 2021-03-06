/*
 * Scala.js (https://www.scala-js.org/)
 *
 * Copyright EPFL.
 *
 * Licensed under Apache License 2.0
 * (https://www.apache.org/licenses/LICENSE-2.0).
 *
 * See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 */

package org.scalajs.io

import java.io._

final class AtomicWritableFileVirtualBinaryFile(file: File) extends WritableVirtualBinaryFile {
  override def outputStream: OutputStream =
    new BufferedOutputStream(new AtomicFileOutputStream(file))
}
