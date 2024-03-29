/****************************************************************************
 * Copyright (c) 2004 Composent, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Composent, Inc. - initial API and implementation
 *****************************************************************************/

package org.eclipse.ecf.provider.skype;

import org.eclipse.ecf.provider.skype.identity.SkypeUserID;
import org.eclipse.ecf.telephony.call.ICallSessionListener;

import com.skype.Call;
import com.skype.SkypeException;

/**
 * 
 */
public class SkypeReceiverCallSession extends SkypeCallSession {

	/**
	 * @param adapter 
	 * @param receiverID
	 * @param initiatorID 
	 * @param receivedCall
	 * @param listener 
	 * @throws SkypeException 
	 */
	public SkypeReceiverCallSession(SkypeCallContainerAdapter adapter, SkypeUserID receiverID, SkypeUserID initiatorID, Call receivedCall, ICallSessionListener listener) throws SkypeException {
		super(adapter, initiatorID, receiverID, receivedCall, listener);
	}

}
