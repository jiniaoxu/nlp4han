/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.lc.nlp4han.ml.maxent.gis;

import java.io.DataInputStream;

import com.lc.nlp4han.ml.model.BinaryFileDataReader;

/**
 * A reader for GIS models stored in binary format.
 */
public class BinaryGISModelReader extends GISModelReader {

  /**
   * Constructor which directly instantiates the DataInputStream containing the
   * model contents.
   *
   * @param dis
   *          The DataInputStream containing the model information.
   */
  public BinaryGISModelReader(DataInputStream dis) {
    super(new BinaryFileDataReader(dis));
  }
}