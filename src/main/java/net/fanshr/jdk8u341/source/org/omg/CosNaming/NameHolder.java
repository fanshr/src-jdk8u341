package org.omg.CosNaming;


/**
* org/omg/CosNaming/NameHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-x64-cygwin/jdk8u341/2692/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Thursday, June 16, 2022 3:52:35 PM UTC
*/


/**
   * A name is a sequence of name components.
   */
public final class NameHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CosNaming.NameComponent value[] = null;

  public NameHolder ()
  {
  }

  public NameHolder (org.omg.CosNaming.NameComponent[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CosNaming.NameHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CosNaming.NameHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CosNaming.NameHelper.type ();
  }

}