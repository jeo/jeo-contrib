/* Copyright 2015 The jeo project. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jeo.lucene;

import io.jeo.vector.VectorApiTestBase;
import io.jeo.vector.VectorDataset;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class LuceneApiTest extends VectorApiTestBase {

    static LuceneDataset data;

    @BeforeClass
    public static void createTestData() throws Exception {
        data = LuceneTests.setUpStatesData();
    }

    @AfterClass
    public static void destroyTestData() throws Exception {
        data.close();
        data = null;
    }

    @Override
    protected VectorDataset createVectorData() throws Exception {
        return data;
    }
}
