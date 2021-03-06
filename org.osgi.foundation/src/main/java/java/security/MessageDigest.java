/*
 * $Header: /cvshome/build/ee.foundation/src/java/security/MessageDigest.java,v 1.6 2006/03/14 01:20:26 hargrave Exp $
 *
 * (C) Copyright 2001 Sun Microsystems, Inc.
 * Copyright (c) OSGi Alliance (2001, 2005). All Rights Reserved.
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

package java.security;
public abstract class MessageDigest extends java.security.MessageDigestSpi {
	protected MessageDigest(java.lang.String var0) { }
	public java.lang.Object clone() throws java.lang.CloneNotSupportedException { return null; }
	public byte[] digest() { return null; }
	public byte[] digest(byte[] var0) { return null; }
	public int digest(byte[] var0, int var1, int var2) throws java.security.DigestException { return 0; }
	public final java.lang.String getAlgorithm() { return null; }
	public final int getDigestLength() { return 0; }
	public static java.security.MessageDigest getInstance(java.lang.String var0) throws java.security.NoSuchAlgorithmException { return null; }
	public static java.security.MessageDigest getInstance(java.lang.String var0, java.lang.String var1) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException { return null; }
	public final java.security.Provider getProvider() { return null; }
	public static boolean isEqual(byte[] var0, byte[] var1) { return false; }
	public void reset() { }
	public java.lang.String toString() { return null; }
	public void update(byte[] var0) { }
	public void update(byte[] var0, int var1, int var2) { }
	public void update(byte var0) { }
}

