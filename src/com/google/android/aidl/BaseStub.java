// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.aidl;

import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.RemoteException;

public abstract class BaseStub extends Binder implements IInterface
{
    public IBinder asBinder() {
        return this;
    }
    
    protected boolean routeToSuperOrEnforceInterface(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n <= 16777215) {
            parcel.enforceInterface(this.getInterfaceDescriptor());
            return false;
        }
        try {
            return super.onTransact(n, parcel, parcel2, n2);
        }
        catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }
}
