package global.skymind.solution.image_processing;/*
 *
 *  * ******************************************************************************
 *  *  * Copyright (c) 2019 Skymind AI Bhd.
 *  *  * Copyright (c) 2020 CertifAI Sdn. Bhd.
 *  *  *
 *  *  * This program and the accompanying materials are made available under the
 *  *  * terms of the Apache License, Version 2.0 which is available at
 *  *  * https://www.apache.org/licenses/LICENSE-2.0.
 *  *  *
 *  *  * Unless required by applicable law or agreed to in writing, software
 *  *  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  *  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  *  * License for the specific language governing permissions and limitations
 *  *  * under the License.
 *  *  *
 *  *  * SPDX-License-Identifier: Apache-2.0
 *  *  *****************************************************************************
 *
 *
 */

import org.bytedeco.opencv.opencv_core.Mat;
import org.nd4j.linalg.io.ClassPathResource;

import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;

import java.io.IOException;


/*
*
* Apply Histogram Equalization to enhance contrast of an input image
* TASKS:
* -----
* 1. Load x-ray.jpeg from the resources/image_processing folder
* 2. Apply the Histogram Equalization function provided in JavaCV
* 3. Display the image both "before" and "after" contrast enhancement
*
* */

public class HistogramEqualization {
    public static void main(String[] args) throws IOException {
        String imgpath= new ClassPathResource("image_processing/x-ray.jpeg").getFile().getAbsolutePath();

        Mat src = imread(imgpath, IMREAD_GRAYSCALE);
        Mat dest = new Mat();

        equalizeHist(src, dest);

        Display.display(src, "Before Histogram Equalization");
        Display.display(dest, "After Histogram Equalization");


    }
}
