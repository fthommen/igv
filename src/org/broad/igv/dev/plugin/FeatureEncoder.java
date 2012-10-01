/*
 * Copyright (c) 2007-2012 The Broad Institute, Inc.
 * SOFTWARE COPYRIGHT NOTICE
 * This software and its documentation are the copyright of the Broad Institute, Inc. All rights are reserved.
 *
 * This software is supplied without any warranty or guaranteed support whatsoever. The Broad Institute is not responsible for its use, misuse, or functionality.
 *
 * This software is licensed under the terms of the GNU Lesser General Public License (LGPL),
 * Version 2.1 which is available at http://www.opensource.org/licenses/lgpl-2.1.php.
 */

package org.broad.igv.dev.plugin;

import org.broad.tribble.Feature;

import java.io.OutputStream;
import java.util.Iterator;

/**
 * Interface for creating a string from a feature. We also require
 * certain metadata, such as header and the number of columns for each feature
 * User: jacob
 * Date: 2012-Aug-02
 *
 * @see PluginCodec
 * @see FeatureDecoder
 */
public interface FeatureEncoder<T extends Feature> {


    int encodeAll(OutputStream outputStream, Iterator<T> features);

}
