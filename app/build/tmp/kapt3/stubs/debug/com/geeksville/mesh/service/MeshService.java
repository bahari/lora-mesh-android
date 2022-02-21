package com.geeksville.mesh.service;

import java.lang.System;

/**
 * Handles all the communication with android apps.  Also keeps an internal model
 * of the network state.
 *
 * Note: this service will go away once all clients are unbound from it.
 * Warning: do not override toString, it causes infinite recursion on some androids (because contextWrapper.getResources calls to string
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00f6\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00f7\u00012\u00020\u00012\u00020\u0002:\u0004\u00f7\u0001\u00f8\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010p\u001a\u00020qH\u0002J\u0018\u0010r\u001a\u00020q2\u0006\u0010s\u001a\u00020T2\u0006\u0010t\u001a\u00020uH\u0002J\b\u0010v\u001a\u00020\u0015H\u0002J\b\u0010w\u001a\u00020qH\u0002J\b\u0010x\u001a\u00020qH\u0002J\b\u0010y\u001a\u00020qH\u0002J\u0010\u0010z\u001a\u00020q2\u0006\u0010s\u001a\u00020TH\u0002J!\u0010{\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010|\u001a\b\u0012\u0004\u0012\u00020\u000f0}H\u0002\u00a2\u0006\u0002\u0010~J\b\u0010\u007f\u001a\u00020\u0015H\u0002J\u0012\u0010\u0080\u0001\u001a\u0002062\u0007\u0010\u0081\u0001\u001a\u00020\u0015H\u0002J\u0013\u0010\u0082\u0001\u001a\f Z*\u0005\u0018\u00010\u0083\u00010\u0083\u0001H\u0002J\u0014\u0010\u0084\u0001\u001a\u00020\u00132\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010TH\u0002J\u001b\u0010\u0086\u0001\u001a\u00020q2\u0007\u0010\u0087\u0001\u001a\u0002012\u0007\u0010\u0088\u0001\u001a\u00020\u0015H\u0002J\u0012\u0010\u0089\u0001\u001a\u00020q2\u0007\u0010\u008a\u0001\u001a\u00020\u0015H\u0002J\u0012\u0010\u008b\u0001\u001a\u00020q2\u0007\u0010\u008c\u0001\u001a\u00020bH\u0002J\u0012\u0010\u008d\u0001\u001a\u00020q2\u0007\u0010\u008e\u0001\u001a\u00020JH\u0002J\u001c\u0010\u008f\u0001\u001a\u00020q2\u0007\u0010\u0090\u0001\u001a\u00020\u00152\b\u0010\u0091\u0001\u001a\u00030\u0092\u0001H\u0002J\u0013\u0010\u0093\u0001\u001a\u00020q2\b\u0010\u0085\u0001\u001a\u00030\u0094\u0001H\u0002J\u0013\u0010\u0095\u0001\u001a\u00020q2\b\u0010\u0085\u0001\u001a\u00030\u0094\u0001H\u0002J&\u0010\u0096\u0001\u001a\u00020q2\u0007\u0010\u0097\u0001\u001a\u00020\u00152\u0007\u0010s\u001a\u00030\u0098\u00012\t\b\u0002\u0010\u0099\u0001\u001a\u00020\u0017H\u0002J\u001b\u0010\u009a\u0001\u001a\u00020q2\u0007\u0010\u0097\u0001\u001a\u00020\u00152\u0007\u0010s\u001a\u00030\u009b\u0001H\u0002J\u0013\u0010\u009c\u0001\u001a\u00020q2\b\u0010\u009d\u0001\u001a\u00030\u009e\u0001H\u0002J\'\u0010\u009f\u0001\u001a\u00020q2\u0007\u0010\u00a0\u0001\u001a\u00020@2\r\u0010\u00a1\u0001\u001a\b\u0012\u0004\u0012\u0002060\u000eH\u0002\u00a2\u0006\u0003\u0010\u00a2\u0001J\u0012\u0010\u00a3\u0001\u001a\u00020q2\u0007\u0010\u008e\u0001\u001a\u00020JH\u0002J\t\u0010\u00a4\u0001\u001a\u00020qH\u0002J\t\u0010\u00a5\u0001\u001a\u00020qH\u0002J\u001c\u0010\u00a6\u0001\u001a\f Z*\u0005\u0018\u00010\u00a7\u00010\u00a7\u00012\u0007\u0010\u00a8\u0001\u001a\u00020\u0015H\u0002J\u001c\u0010\u00a6\u0001\u001a\f Z*\u0005\u0018\u00010\u00a7\u00010\u00a7\u00012\u0007\u0010\u0088\u0001\u001a\u00020\u0013H\u0002J\u0018\u0010\u00a9\u0001\u001a\u0005\u0018\u00010\u00aa\u00012\n\u0010\u00ab\u0001\u001a\u0005\u0018\u00010\u00ac\u0001H\u0016J\u0012\u0010\u00ad\u0001\u001a\u00020q2\u0007\u0010\u00ae\u0001\u001a\u00020\u001dH\u0002J\t\u0010\u00af\u0001\u001a\u00020qH\u0016J\t\u0010\u00b0\u0001\u001a\u00020qH\u0016J\t\u0010\u00b1\u0001\u001a\u00020qH\u0002J\t\u0010\u00b2\u0001\u001a\u00020qH\u0002J\'\u0010\u00b3\u0001\u001a\u00020\u00152\n\u0010\u00ab\u0001\u001a\u0005\u0018\u00010\u00ac\u00012\u0007\u0010\u00b4\u0001\u001a\u00020\u00152\u0007\u0010\u00b5\u0001\u001a\u00020\u0015H\u0016JB\u0010\u00b6\u0001\u001a\u00020q2\n\b\u0002\u0010\u00b7\u0001\u001a\u00030\u00b8\u00012\n\b\u0002\u0010\u00b9\u0001\u001a\u00030\u00b8\u00012\t\b\u0002\u0010\u00ba\u0001\u001a\u00020\u00152\t\b\u0002\u0010\u00bb\u0001\u001a\u00020\u00152\t\b\u0002\u0010\u00bc\u0001\u001a\u000201H\u0002J\u0013\u0010\u00bd\u0001\u001a\u00020q2\b\u0010\u0085\u0001\u001a\u00030\u0094\u0001H\u0002J\t\u0010\u00be\u0001\u001a\u00020qH\u0002J\u0012\u0010\u00bf\u0001\u001a\u00020q2\u0007\u0010\u00c0\u0001\u001a\u00020TH\u0002J\t\u0010\u00c1\u0001\u001a\u00020qH\u0002J\t\u0010\u00c2\u0001\u001a\u00020qH\u0002J\u0012\u0010\u00c3\u0001\u001a\u00020q2\u0007\u0010\u00c4\u0001\u001a\u00020\u0015H\u0002J\t\u0010\u00c5\u0001\u001a\u00020qH\u0002J\u0007\u0010\u00c6\u0001\u001a\u00020qJ\t\u0010\u00c7\u0001\u001a\u00020qH\u0002J\t\u0010\u00c8\u0001\u001a\u00020qH\u0002J\u0011\u0010\u00c9\u0001\u001a\u00020q2\u0006\u0010s\u001a\u00020TH\u0002JB\u0010\u00ca\u0001\u001a\u00020q2\n\b\u0002\u0010\u00b7\u0001\u001a\u00030\u00b8\u00012\n\b\u0002\u0010\u00b9\u0001\u001a\u00030\u00b8\u00012\t\b\u0002\u0010\u00ba\u0001\u001a\u00020\u00152\t\b\u0002\u0010\u00bb\u0001\u001a\u00020\u00152\t\b\u0002\u0010\u00bc\u0001\u001a\u000201H\u0002J\u0012\u0010\u00cb\u0001\u001a\u00020q2\u0007\u0010\u00ae\u0001\u001a\u00020^H\u0002J\u001e\u0010\u00cc\u0001\u001a\u00020q2\b\u0010\u0085\u0001\u001a\u00030\u0094\u00012\t\b\u0002\u0010\u00cd\u0001\u001a\u000201H\u0002J\u001d\u0010\u00cc\u0001\u001a\u00020q2\u0007\u0010s\u001a\u00030\u00ce\u00012\t\b\u0002\u0010\u00cd\u0001\u001a\u000201H\u0002J\u0012\u0010\u00cf\u0001\u001a\u00020q2\u0007\u0010\u00d0\u0001\u001a\u00020\u000fH\u0002J\u0011\u0010,\u001a\u00020q2\u0007\u0010\u008e\u0001\u001a\u00020@H\u0002J$\u0010\u00d1\u0001\u001a\u00020q2\t\u0010\u00d2\u0001\u001a\u0004\u0018\u00010\u00132\u0007\u0010\u00d3\u0001\u001a\u00020\u00132\u0007\u0010\u00d4\u0001\u001a\u00020\u0013J\u0013\u0010\u00d5\u0001\u001a\u00020q2\b\u0010\u00d6\u0001\u001a\u00030\u00d7\u0001H\u0002J\t\u0010\u00d8\u0001\u001a\u00020qH\u0002J\t\u0010\u00d9\u0001\u001a\u00020qH\u0002J\t\u0010\u00da\u0001\u001a\u00020qH\u0002J\t\u0010\u00db\u0001\u001a\u00020qH\u0002J\u0012\u0010\u00dc\u0001\u001a\u00020q2\u0007\u0010\u00dd\u0001\u001a\u00020\u0017H\u0003J\t\u0010\u00de\u0001\u001a\u00020qH\u0002J\u0015\u0010\u00df\u0001\u001a\u0004\u0018\u00010T2\b\u0010\u0085\u0001\u001a\u00030\u0094\u0001H\u0002J\u0012\u0010\u00e0\u0001\u001a\u00030\u0094\u00012\u0006\u0010s\u001a\u00020TH\u0002J\u0014\u0010\u00e1\u0001\u001a\u0004\u0018\u00010\u00132\u0007\u0010\u0081\u0001\u001a\u00020\u0015H\u0002J\u0012\u0010\u00e2\u0001\u001a\u0002062\u0007\u0010\u0081\u0001\u001a\u00020\u0015H\u0002J\u0012\u0010\u00e2\u0001\u001a\u0002062\u0007\u0010\u0088\u0001\u001a\u00020\u0013H\u0002J\u0012\u0010\u00e3\u0001\u001a\u00020\u00152\u0007\u0010\u0088\u0001\u001a\u00020\u0013H\u0002J\u0012\u0010\u00e4\u0001\u001a\u00020q2\u0007\u0010\u00e5\u0001\u001a\u00020TH\u0002J3\u0010\u00e6\u0001\u001a\u00020q2\u0007\u0010\u00e7\u0001\u001a\u00020\u00152\t\b\u0002\u0010\u00e8\u0001\u001a\u0002012\u0014\u0010\u00e9\u0001\u001a\u000f\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020q0\u00ea\u0001H\u0002J\t\u0010\u00eb\u0001\u001a\u00020qH\u0002J\t\u0010\u00ec\u0001\u001a\u00020qH\u0002J7\u0010\u00ed\u0001\u001a\u00030\u0094\u0001*\u00030\u00a7\u00012\t\b\u0002\u0010\u00bc\u0001\u001a\u0002012\u001b\u0010\u00ee\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u00ef\u0001\u0012\u0004\u0012\u00020q0\u00ea\u0001\u00a2\u0006\u0003\b\u00f0\u0001H\u0002JY\u0010\u00f1\u0001\u001a\u00030\u0094\u0001*\u00030\u00a7\u00012\t\b\u0002\u0010\u00f2\u0001\u001a\u0002012\t\b\u0002\u0010\u0088\u0001\u001a\u00020\u00152\t\b\u0002\u0010\u00f3\u0001\u001a\u00020\u00152\n\b\u0002\u0010\u00f4\u0001\u001a\u00030\u00f5\u00012\u001b\u0010\u00ee\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u00f6\u0001\u0012\u0004\u0012\u00020q0\u00ea\u0001\u00a2\u0006\u0003\b\u00f0\u0001H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078B@BX\u0082\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010$\u001a\u00020%8F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u00105\u001a\u0004\u0018\u0001068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b7\u00108R\u000e\u00109\u001a\u00020:X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010<\u001a\u0004\u0018\u00010\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b=\u0010>R\u001c\u0010?\u001a\u0004\u0018\u00010@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bF\u0010 R\u0010\u0010G\u001a\u0004\u0018\u00010@X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010H\u001a\b\u0012\u0004\u0012\u00020J0IX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u0002060\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002060\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010M\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bN\u0010>R\u0014\u0010O\u001a\u00020\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bP\u0010 R\u0014\u0010Q\u001a\u00020\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bR\u0010 R\u0014\u0010S\u001a\b\u0012\u0004\u0012\u00020T0IX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010U\u001a\u0004\u0018\u00010VX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010W\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u0010X\u001a\u0010\u0012\f\u0012\n Z*\u0004\u0018\u00010\u00190\u00190Y\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0010\u0010]\u001a\u0004\u0018\u00010^X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020`X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010a\u001a\u0004\u0018\u00010bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010c\u001a\b\u0012\u0004\u0012\u00020T0IX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020T0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020hX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020jX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020lX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010m\u001a\u0004\u0018\u00010nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010o\u001a\u0004\u0018\u00010nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00f9\u0001"}, d2 = {"Lcom/geeksville/mesh/service/MeshService;", "Landroid/app/Service;", "Lcom/geeksville/android/Logging;", "()V", "binder", "Lcom/geeksville/mesh/IMeshService$Stub;", "value", "Lcom/geeksville/mesh/AppOnlyProtos$ChannelSet;", "channelSet", "getChannelSet", "()Lcom/geeksville/mesh/AppOnlyProtos$ChannelSet;", "setChannelSet", "(Lcom/geeksville/mesh/AppOnlyProtos$ChannelSet;)V", "channels", "", "Lcom/geeksville/mesh/ChannelProtos$Channel;", "[Lcom/geeksville/mesh/ChannelProtos$Channel;", "clientPackages", "", "", "configNonce", "", "connectTimeMsec", "", "connectedRadio", "Lcom/geeksville/mesh/IRadioInterfaceService;", "getConnectedRadio", "()Lcom/geeksville/mesh/IRadioInterfaceService;", "connectionState", "Lcom/geeksville/mesh/service/MeshService$ConnectionState;", "curRegionValue", "getCurRegionValue", "()I", "setCurRegionValue", "(I)V", "currentPacketId", "deviceVersion", "Lcom/geeksville/mesh/model/DeviceVersion;", "getDeviceVersion", "()Lcom/geeksville/mesh/model/DeviceVersion;", "firmwareUpdateFilename", "Lcom/geeksville/mesh/service/UpdateFilenames;", "getFirmwareUpdateFilename", "()Lcom/geeksville/mesh/service/UpdateFilenames;", "setFirmwareUpdateFilename", "(Lcom/geeksville/mesh/service/UpdateFilenames;)V", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "haveNodeDB", "", "hexIdRegex", "Lkotlin/text/Regex;", "legacyRegion", "localNodeInfo", "Lcom/geeksville/mesh/NodeInfo;", "getLocalNodeInfo", "()Lcom/geeksville/mesh/NodeInfo;", "locationCallback", "Lcom/geeksville/mesh/service/MeshServiceLocationCallback;", "locationIntervalMsec", "myNodeID", "getMyNodeID", "()Ljava/lang/String;", "myNodeInfo", "Lcom/geeksville/mesh/MyNodeInfo;", "getMyNodeInfo", "()Lcom/geeksville/mesh/MyNodeInfo;", "setMyNodeInfo", "(Lcom/geeksville/mesh/MyNodeInfo;)V", "myNodeNum", "getMyNodeNum", "newMyNodeInfo", "newNodes", "", "Lcom/geeksville/mesh/MeshProtos$NodeInfo;", "nodeDBbyID", "nodeDBbyNodeNum", "notificationSummary", "getNotificationSummary", "numNodes", "getNumNodes", "numOnlineNodes", "getNumOnlineNodes", "offlineSentPackets", "Lcom/geeksville/mesh/DataPacket;", "packetRepo", "Lcom/geeksville/mesh/database/PacketRepository;", "previousSummary", "radio", "Lcom/geeksville/android/ServiceClient;", "kotlin.jvm.PlatformType", "getRadio", "()Lcom/geeksville/android/ServiceClient;", "radioConfig", "Lcom/geeksville/mesh/RadioConfigProtos$RadioConfig;", "radioInterfaceReceiver", "Landroid/content/BroadcastReceiver;", "rawMyNodeInfo", "Lcom/geeksville/mesh/MeshProtos$MyNodeInfo;", "recentDataPackets", "sentPackets", "serviceBroadcasts", "Lcom/geeksville/mesh/service/MeshServiceBroadcasts;", "serviceJob", "Lkotlinx/coroutines/CompletableJob;", "serviceNotifications", "Lcom/geeksville/mesh/service/MeshServiceNotifications;", "serviceScope", "Lkotlinx/coroutines/CoroutineScope;", "sleepTimeout", "Lkotlinx/coroutines/Job;", "updateJob", "cDTimer", "", "changeStatus", "p", "m", "Lcom/geeksville/mesh/MessageStatus;", "currentSecond", "deleteOldPackets", "discardNodeDB", "doFirmwareUpdate", "enqueueForSending", "fixupChannelList", "lIn", "", "(Ljava/util/List;)[Lcom/geeksville/mesh/ChannelProtos$Channel;", "generatePacketId", "getOrCreateNodeInfo", "n", "getPrefs", "Landroid/content/SharedPreferences;", "getSenderName", "packet", "handleAckNak", "isAck", "id", "handleConfigComplete", "configCompleteId", "handleMyInfo", "myInfo", "handleNodeInfo", "info", "handleReceivedAdmin", "fromNodeNum", "a", "Lcom/geeksville/mesh/AdminProtos$AdminMessage;", "handleReceivedData", "Lcom/geeksville/mesh/MeshProtos$MeshPacket;", "handleReceivedMeshPacket", "handleReceivedPosition", "fromNum", "Lcom/geeksville/mesh/MeshProtos$Position;", "defaultTime", "handleReceivedUser", "Lcom/geeksville/mesh/MeshProtos$User;", "insertPacket", "packetToSave", "Lcom/geeksville/mesh/database/entity/Packet;", "installNewNodeDB", "ni", "nodes", "(Lcom/geeksville/mesh/MyNodeInfo;[Lcom/geeksville/mesh/NodeInfo;)V", "installNodeInfo", "loadSettings", "maybeUpdateServiceStatusNotification", "newMeshPacketTo", "Lcom/geeksville/mesh/MeshProtos$MeshPacket$Builder;", "idNum", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onConnectionChanged", "c", "onCreate", "onDestroy", "onHasSettings", "onNodeDBChanged", "onStartCommand", "flags", "startId", "perhapsSendPosition", "lat", "", "lon", "alt", "destNum", "wantResponse", "processReceivedMeshPacket", "regenMyNodeInfo", "rememberDataPacket", "dataPacket", "repeater", "reportConnection", "requestChannel", "channelIndex", "requestRadioConfig", "resetDevice", "saveSettings", "sendAnalytics", "sendNow", "sendPosition", "sendRadioConfig", "sendToRadio", "requireConnected", "Lcom/geeksville/mesh/MeshProtos$ToRadio$Builder;", "setChannel", "channel", "setOwner", "myId", "longName", "shortName", "setRadioConfig", "payload", "", "setRegionOnDevice", "setupLocationRequest", "startConfig", "startForeground", "startLocationRequests", "requestInterval", "stopLocationRequests", "toDataPacket", "toMeshPacket", "toNodeID", "toNodeInfo", "toNodeNum", "updateMessageNotification", "message", "updateNodeInfo", "nodeNum", "withBroadcast", "updateFn", "Lkotlin/Function1;", "updateRegion", "warnUserAboutLocation", "buildAdminPacket", "initFn", "Lcom/geeksville/mesh/AdminProtos$AdminMessage$Builder;", "Lkotlin/ExtensionFunctionType;", "buildMeshPacket", "wantAck", "hopLimit", "priority", "Lcom/geeksville/mesh/MeshProtos$MeshPacket$Priority;", "Lcom/geeksville/mesh/MeshProtos$Data$Builder;", "Companion", "ConnectionState", "app_debug"})
public final class MeshService extends android.app.Service implements com.geeksville.android.Logging {
    @org.jetbrains.annotations.NotNull()
    public static final com.geeksville.mesh.service.MeshService.Companion Companion = null;
    private static boolean isActionAchieved = false;
    private static int secondsPassed = 0;
    private static boolean startTimer = false;
    private static boolean resetStart = false;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_NODE_CHANGE = "com.geeksville.mesh.NODE_CHANGE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_MESH_CONNECTED = "com.geeksville.mesh.MESH_CONNECTED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_MESSAGE_STATUS = "com.geeksville.mesh.MESSAGE_STATUS";
    
    /**
     * The minimmum firmware version we know how to talk to. We'll still be able to talk to 1.0 firmwares but only well enough to ask them to firmware update
     */
    @org.jetbrains.annotations.NotNull()
    private static final com.geeksville.mesh.model.DeviceVersion minFirmwareVersion = null;
    private java.lang.String previousSummary;
    private final java.util.Map<java.lang.String, java.lang.String> clientPackages = null;
    private final com.geeksville.mesh.service.MeshServiceNotifications serviceNotifications = null;
    private final com.geeksville.mesh.service.MeshServiceBroadcasts serviceBroadcasts = null;
    private final kotlinx.coroutines.CompletableJob serviceJob = null;
    private final kotlinx.coroutines.CoroutineScope serviceScope = null;
    private com.geeksville.mesh.service.MeshService.ConnectionState connectionState = com.geeksville.mesh.service.MeshService.ConnectionState.DISCONNECTED;
    private com.geeksville.mesh.database.PacketRepository packetRepo;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    private int curRegionValue = com.geeksville.mesh.RadioConfigProtos.RegionCode.Unset_VALUE;
    @org.jetbrains.annotations.NotNull()
    private final com.geeksville.android.ServiceClient<com.geeksville.mesh.IRadioInterfaceService> radio = null;
    private final com.geeksville.mesh.service.MeshServiceLocationCallback locationCallback = null;
    private long locationIntervalMsec = 0L;
    @org.jetbrains.annotations.Nullable()
    private com.geeksville.mesh.MyNodeInfo myNodeInfo;
    private com.geeksville.mesh.RadioConfigProtos.RadioConfig radioConfig;
    private com.geeksville.mesh.ChannelProtos.Channel[] channels;
    @kotlin.jvm.Volatile()
    private volatile boolean haveNodeDB = false;
    private final java.util.Map<java.lang.Integer, com.geeksville.mesh.NodeInfo> nodeDBbyNodeNum = null;
    private final java.util.Map<java.lang.String, com.geeksville.mesh.NodeInfo> nodeDBbyID = null;
    private final kotlin.text.Regex hexIdRegex = null;
    private java.util.List<com.geeksville.mesh.DataPacket> recentDataPackets;
    private final java.util.List<com.geeksville.mesh.DataPacket> offlineSentPackets = null;
    
    /**
     * Keep a record of recently sent packets, so we can properly handle ack/nak
     */
    private final java.util.Map<java.lang.Integer, com.geeksville.mesh.DataPacket> sentPackets = null;
    private kotlinx.coroutines.Job sleepTimeout;
    private long connectTimeMsec = 0L;
    
    /**
     * Receives messages from our BT radio service and processes them to update our model
     * and send to clients as needed.
     */
    private final android.content.BroadcastReceiver radioInterfaceReceiver = null;
    private com.geeksville.mesh.MyNodeInfo newMyNodeInfo;
    private final java.util.List<com.geeksville.mesh.MeshProtos.NodeInfo> newNodes = null;
    private int configNonce = 1;
    private com.geeksville.mesh.MeshProtos.MyNodeInfo rawMyNodeInfo;
    private java.lang.String legacyRegion;
    private long currentPacketId;
    @org.jetbrains.annotations.Nullable()
    private com.geeksville.mesh.service.UpdateFilenames firmwareUpdateFilename;
    private kotlinx.coroutines.Job updateJob;
    private final com.geeksville.mesh.IMeshService.Stub binder = null;
    
    public MeshService() {
        super();
    }
    
    public final int getCurRegionValue() {
        return 0;
    }
    
    public final void setCurRegionValue(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.geeksville.android.ServiceClient<com.geeksville.mesh.IRadioInterfaceService> getRadio() {
        return null;
    }
    
    private final java.lang.String getSenderName(com.geeksville.mesh.DataPacket packet) {
        return null;
    }
    
    private final java.lang.String getNotificationSummary() {
        return null;
    }
    
    private final void warnUserAboutLocation() {
    }
    
    /**
     * a periodic callback that perhaps send our position to other nodes.
     * We first check to see if our local device has already sent a position and if so, we punt until the next check.
     * This allows us to only 'fill in' with GPS positions when the local device happens to have no good GPS sats.
     */
    private final void perhapsSendPosition(double lat, double lon, int alt, int destNum, boolean wantResponse) {
    }
    
    /**
     * start our location requests (if they weren't already running)
     *
     * per https://developer.android.com/training/location/change-location-settings
     */
    @androidx.annotation.UiThread()
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void startLocationRequests(long requestInterval) {
    }
    
    private final void stopLocationRequests() {
    }
    
    private final com.geeksville.mesh.IRadioInterfaceService getConnectedRadio() {
        return null;
    }
    
    /**
     * Send a command/packet to our radio.  But cope with the possiblity that we might start up
     *   before we are fully bound to the RadioInterfaceService
     *   @param requireConnected set to false if you are okay with using a partially connected device (i.e. during startup)
     */
    private final void sendToRadio(com.geeksville.mesh.MeshProtos.ToRadio.Builder p, boolean requireConnected) {
    }
    
    /**
     * Send a mesh packet to the radio, if the radio is not currently connected this function will throw NotConnectedException
     */
    private final void sendToRadio(com.geeksville.mesh.MeshProtos.MeshPacket packet, boolean requireConnected) {
    }
    
    private final void updateMessageNotification(com.geeksville.mesh.DataPacket message) {
    }
    
    /**
     * tell android not to kill us
     */
    private final void startForeground() {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    /**
     * If someone binds to us, this will be called after on create
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    /**
     * If someone starts us (or restarts us) this will be called after onCreate)
     */
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final android.content.SharedPreferences getPrefs() {
        return null;
    }
    
    private final void saveSettings() {
    }
    
    private final void installNewNodeDB(com.geeksville.mesh.MyNodeInfo ni, com.geeksville.mesh.NodeInfo[] nodes) {
    }
    
    private final void loadSettings() {
    }
    
    /**
     * discard entire node db & message state - used when downloading a new db from the device
     */
    private final void discardNodeDB() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.geeksville.mesh.MyNodeInfo getMyNodeInfo() {
        return null;
    }
    
    public final void setMyNodeInfo(@org.jetbrains.annotations.Nullable()
    com.geeksville.mesh.MyNodeInfo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.geeksville.mesh.model.DeviceVersion getDeviceVersion() {
        return null;
    }
    
    private final com.geeksville.mesh.NodeInfo toNodeInfo(int n) {
        return null;
    }
    
    private final com.geeksville.mesh.NodeInfo getLocalNodeInfo() {
        return null;
    }
    
    /**
     * Map a nodenum to the nodeid string, or return null if not present
     *   If we have a NodeInfo for this ID we prefer to return the string ID inside the user record.
     *   but some nodes might not have a user record at all (because not yet received), in that case, we return
     *   a hex version of the ID just based on the number
     */
    private final java.lang.String toNodeID(int n) {
        return null;
    }
    
    private final com.geeksville.mesh.NodeInfo getOrCreateNodeInfo(int n) {
        return null;
    }
    
    private final com.geeksville.mesh.NodeInfo toNodeInfo(java.lang.String id) {
        return null;
    }
    
    private final int getNumNodes() {
        return 0;
    }
    
    private final int getNumOnlineNodes() {
        return 0;
    }
    
    private final int toNodeNum(java.lang.String id) {
        return 0;
    }
    
    private final void updateNodeInfo(int nodeNum, boolean withBroadcast, kotlin.jvm.functions.Function1<? super com.geeksville.mesh.NodeInfo, kotlin.Unit> updateFn) {
    }
    
    private final int getMyNodeNum() {
        return 0;
    }
    
    private final java.lang.String getMyNodeID() {
        return null;
    }
    
    private final com.geeksville.mesh.AppOnlyProtos.ChannelSet getChannelSet() {
        return null;
    }
    
    private final void setChannelSet(com.geeksville.mesh.AppOnlyProtos.ChannelSet value) {
    }
    
    private final com.geeksville.mesh.MeshProtos.MeshPacket.Builder newMeshPacketTo(int idNum) {
        return null;
    }
    
    /**
     * Generate a new mesh packet builder with our node as the sender, and the specified recipient
     *
     * If id is null we assume a broadcast message
     */
    private final com.geeksville.mesh.MeshProtos.MeshPacket.Builder newMeshPacketTo(java.lang.String id) {
        return null;
    }
    
    /**
     * Helper to make it easy to build a subpacket in the proper protobufs
     */
    private final com.geeksville.mesh.MeshProtos.MeshPacket buildMeshPacket(com.geeksville.mesh.MeshProtos.MeshPacket.Builder $this$buildMeshPacket, boolean wantAck, int id, int hopLimit, com.geeksville.mesh.MeshProtos.MeshPacket.Priority priority, kotlin.jvm.functions.Function1<? super com.geeksville.mesh.MeshProtos.Data.Builder, kotlin.Unit> initFn) {
        return null;
    }
    
    /**
     * Helper to make it easy to build a subpacket in the proper protobufs
     */
    private final com.geeksville.mesh.MeshProtos.MeshPacket buildAdminPacket(com.geeksville.mesh.MeshProtos.MeshPacket.Builder $this$buildAdminPacket, boolean wantResponse, kotlin.jvm.functions.Function1<? super com.geeksville.mesh.AdminProtos.AdminMessage.Builder, kotlin.Unit> initFn) {
        return null;
    }
    
    private final com.geeksville.mesh.DataPacket toDataPacket(com.geeksville.mesh.MeshProtos.MeshPacket packet) {
        return null;
    }
    
    private final com.geeksville.mesh.MeshProtos.MeshPacket toMeshPacket(com.geeksville.mesh.DataPacket p) {
        return null;
    }
    
    private final void rememberDataPacket(com.geeksville.mesh.DataPacket dataPacket) {
    }
    
    private final void handleReceivedData(com.geeksville.mesh.MeshProtos.MeshPacket packet) {
    }
    
    private final void handleReceivedAdmin(int fromNodeNum, com.geeksville.mesh.AdminProtos.AdminMessage a) {
    }
    
    private final void handleReceivedUser(int fromNum, com.geeksville.mesh.MeshProtos.User p) {
    }
    
    /**
     * Update our DB of users based on someone sending out a Position subpacket
     * @param defaultTime in msecs since 1970
     */
    private final void handleReceivedPosition(int fromNum, com.geeksville.mesh.MeshProtos.Position p, long defaultTime) {
    }
    
    private final void handleReceivedMeshPacket(com.geeksville.mesh.MeshProtos.MeshPacket packet) {
    }
    
    private final void sendNow(com.geeksville.mesh.DataPacket p) {
    }
    
    /**
     * Change the status on a data packet and update watchers
     */
    private final void changeStatus(com.geeksville.mesh.DataPacket p, com.geeksville.mesh.MessageStatus m) {
    }
    
    /**
     * Handle an ack/nak packet by updating sent message status
     */
    private final void handleAckNak(boolean isAck, int id) {
    }
    
    private final void processReceivedMeshPacket(com.geeksville.mesh.MeshProtos.MeshPacket packet) {
    }
    
    private final void insertPacket(com.geeksville.mesh.database.entity.Packet packetToSave) {
    }
    
    private final int currentSecond() {
        return 0;
    }
    
    private final void onNodeDBChanged() {
    }
    
    private final void setupLocationRequest() {
    }
    
    /**
     * Send in analytics about mesh connection
     */
    private final void reportConnection() {
    }
    
    private final void onConnectionChanged(com.geeksville.mesh.service.MeshService.ConnectionState c) {
    }
    
    private final void maybeUpdateServiceStatusNotification() {
    }
    
    /**
     * Convert a protobuf NodeInfo into our model objects and update our node DB
     */
    private final void installNodeInfo(com.geeksville.mesh.MeshProtos.NodeInfo info) {
    }
    
    private final void handleNodeInfo(com.geeksville.mesh.MeshProtos.NodeInfo info) {
    }
    
    /**
     * Regenerate the myNodeInfo model.  We call this twice.  Once after we receive myNodeInfo from the device
     * and again after we have the node DB (which might allow us a better notion of our HwModel.
     */
    private final void regenMyNodeInfo() {
    }
    
    private final void sendAnalytics() {
    }
    
    /**
     * Update the nodeinfo (called from either new API version or the old one)
     */
    private final void handleMyInfo(com.geeksville.mesh.MeshProtos.MyNodeInfo myInfo) {
    }
    
    private final com.geeksville.mesh.ChannelProtos.Channel[] fixupChannelList(java.util.List<com.geeksville.mesh.ChannelProtos.Channel> lIn) {
        return null;
    }
    
    private final void setRegionOnDevice() {
    }
    
    /**
     * If we are updating nodes we might need to use old (fixed by firmware build)
     * region info to populate our new universal ROMs.
     *
     * This function updates our saved preferences region info and if the device has an unset new
     * region info, we set it.
     */
    private final void updateRegion() {
    }
    
    private final void onHasSettings() {
    }
    
    private final void handleConfigComplete(int configCompleteId) {
    }
    
    private final void requestRadioConfig() {
    }
    
    private final void requestChannel(int channelIndex) {
    }
    
    private final void setChannel(com.geeksville.mesh.ChannelProtos.Channel channel) {
    }
    
    public final void resetDevice() {
    }
    
    /**
     * Start the modern (REV2) API configuration flow
     */
    private final void startConfig() {
    }
    
    private final void cDTimer() {
    }
    
    private final void repeater() {
    }
    
    /**
     * Send a position (typically from our built in GPS) into the mesh.
     * Must be called from serviceScope. Use sendPositionScoped() for direct calls.
     */
    private final void sendPosition(double lat, double lon, int alt, int destNum, boolean wantResponse) {
    }
    
    /**
     * Send our current radio config to the device
     */
    private final void sendRadioConfig(com.geeksville.mesh.RadioConfigProtos.RadioConfig c) {
    }
    
    /**
     * Set our radio config
     */
    private final void setRadioConfig(byte[] payload) {
    }
    
    /**
     * Set our owner with either the new or old API
     */
    public final void setOwner(@org.jetbrains.annotations.Nullable()
    java.lang.String myId, @org.jetbrains.annotations.NotNull()
    java.lang.String longName, @org.jetbrains.annotations.NotNull()
    java.lang.String shortName) {
    }
    
    /**
     * Generate a unique packet ID (if we know enough to do so - otherwise return 0 so the device will do it)
     */
    @kotlin.jvm.Synchronized()
    private final synchronized int generatePacketId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.geeksville.mesh.service.UpdateFilenames getFirmwareUpdateFilename() {
        return null;
    }
    
    public final void setFirmwareUpdateFilename(@org.jetbrains.annotations.Nullable()
    com.geeksville.mesh.service.UpdateFilenames p0) {
    }
    
    /**
     * *
     * Return the filename we will install on the device
     */
    private final void setFirmwareUpdateFilename(com.geeksville.mesh.MyNodeInfo info) {
    }
    
    private final void doFirmwareUpdate() {
    }
    
    /**
     * Remove any sent packets that have been sitting around too long
     *
     * Note: we give each message what the timeout the device code is using, though in the normal
     * case the device will fail after 3 retries much sooner than that (and it will provide a nak to us)
     */
    private final void deleteOldPackets() {
    }
    
    private final void enqueueForSending(com.geeksville.mesh.DataPacket p) {
    }
    
    public void debug(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public void errormsg(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable ex) {
    }
    
    public void info(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public void logAssert(boolean f) {
    }
    
    public void reportError(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
    }
    
    public void verbose(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public void warn(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/geeksville/mesh/service/MeshService$ConnectionState;", "", "(Ljava/lang/String;I)V", "DISCONNECTED", "CONNECTED", "DEVICE_SLEEP", "app_debug"})
    public static enum ConnectionState {
        /*public static final*/ DISCONNECTED /* = new DISCONNECTED() */,
        /*public static final*/ CONNECTED /* = new CONNECTED() */,
        /*public static final*/ DEVICE_SLEEP /* = new DEVICE_SLEEP() */;
        
        ConnectionState() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0006\'()*+,B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0014J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J \u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0004J\u0006\u0010%\u001a\u00020&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u000b\u00a8\u0006-"}, d2 = {"Lcom/geeksville/mesh/service/MeshService$Companion;", "Lcom/geeksville/android/Logging;", "()V", "ACTION_MESH_CONNECTED", "", "ACTION_MESSAGE_STATUS", "ACTION_NODE_CHANGE", "isActionAchieved", "", "()Z", "setActionAchieved", "(Z)V", "minFirmwareVersion", "Lcom/geeksville/mesh/model/DeviceVersion;", "getMinFirmwareVersion", "()Lcom/geeksville/mesh/model/DeviceVersion;", "resetStart", "getResetStart", "setResetStart", "secondsPassed", "", "getSecondsPassed", "()I", "setSecondsPassed", "(I)V", "startTimer", "getStartTimer", "setStartTimer", "actionReceived", "portNum", "changeDeviceAddress", "", "context", "Landroid/content/Context;", "service", "Lcom/geeksville/mesh/IMeshService;", "address", "createIntent", "Landroid/content/Intent;", "IdNotFoundException", "InvalidNodeIdException", "IsUpdatingException", "NoRadioConfigException", "NodeNotFoundException", "NodeNumNotFoundException", "app_debug"})
    public static final class Companion implements com.geeksville.android.Logging {
        
        private Companion() {
            super();
        }
        
        private final java.lang.String actionReceived(java.lang.String portNum) {
            return null;
        }
        
        public final boolean isActionAchieved() {
            return false;
        }
        
        public final void setActionAchieved(boolean p0) {
        }
        
        public final int getSecondsPassed() {
            return 0;
        }
        
        public final void setSecondsPassed(int p0) {
        }
        
        public final boolean getStartTimer() {
            return false;
        }
        
        public final void setStartTimer(boolean p0) {
        }
        
        public final boolean getResetStart() {
            return false;
        }
        
        public final void setResetStart(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String actionReceived(int portNum) {
            return null;
        }
        
        /**
         * Talk to our running service and try to set a new device address.  And then immediately
         * call start on the service to possibly promote our service to be a foreground service.
         */
        public final void changeDeviceAddress(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.geeksville.mesh.IMeshService service, @org.jetbrains.annotations.Nullable()
        java.lang.String address) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent createIntent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.geeksville.mesh.model.DeviceVersion getMinFirmwareVersion() {
            return null;
        }
        
        public void debug(@org.jetbrains.annotations.NotNull()
        java.lang.String msg) {
        }
        
        public void errormsg(@org.jetbrains.annotations.NotNull()
        java.lang.String msg, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable ex) {
        }
        
        public void info(@org.jetbrains.annotations.NotNull()
        java.lang.String msg) {
        }
        
        public void logAssert(boolean f) {
        }
        
        public void reportError(@org.jetbrains.annotations.NotNull()
        java.lang.String s) {
        }
        
        public void verbose(@org.jetbrains.annotations.NotNull()
        java.lang.String msg) {
        }
        
        public void warn(@org.jetbrains.annotations.NotNull()
        java.lang.String msg) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/geeksville/mesh/service/MeshService$Companion$NodeNotFoundException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "reason", "", "(Ljava/lang/String;)V", "app_debug"})
        public static class NodeNotFoundException extends java.lang.Exception {
            
            public NodeNotFoundException(@org.jetbrains.annotations.NotNull()
            java.lang.String reason) {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/geeksville/mesh/service/MeshService$Companion$InvalidNodeIdException;", "Lcom/geeksville/mesh/service/MeshService$Companion$NodeNotFoundException;", "()V", "app_debug"})
        public static final class InvalidNodeIdException extends com.geeksville.mesh.service.MeshService.Companion.NodeNotFoundException {
            
            public InvalidNodeIdException() {
                super(null);
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/geeksville/mesh/service/MeshService$Companion$NodeNumNotFoundException;", "Lcom/geeksville/mesh/service/MeshService$Companion$NodeNotFoundException;", "id", "", "(I)V", "app_debug"})
        public static final class NodeNumNotFoundException extends com.geeksville.mesh.service.MeshService.Companion.NodeNotFoundException {
            
            public NodeNumNotFoundException(int id) {
                super(null);
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/geeksville/mesh/service/MeshService$Companion$IdNotFoundException;", "Lcom/geeksville/mesh/service/MeshService$Companion$NodeNotFoundException;", "id", "", "(Ljava/lang/String;)V", "app_debug"})
        public static final class IdNotFoundException extends com.geeksville.mesh.service.MeshService.Companion.NodeNotFoundException {
            
            public IdNotFoundException(@org.jetbrains.annotations.NotNull()
            java.lang.String id) {
                super(null);
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/geeksville/mesh/service/MeshService$Companion$NoRadioConfigException;", "Lcom/geeksville/mesh/service/RadioNotConnectedException;", "message", "", "(Ljava/lang/String;)V", "app_debug"})
        public static final class NoRadioConfigException extends com.geeksville.mesh.service.RadioNotConnectedException {
            
            public NoRadioConfigException() {
                super(null);
            }
            
            public NoRadioConfigException(@org.jetbrains.annotations.NotNull()
            java.lang.String message) {
                super(null);
            }
        }
        
        /**
         * We treat software update as similar to loss of comms to the regular bluetooth service (so things like sendPosition for background GPS ignores the problem
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/geeksville/mesh/service/MeshService$Companion$IsUpdatingException;", "Lcom/geeksville/mesh/service/RadioNotConnectedException;", "()V", "app_debug"})
        public static final class IsUpdatingException extends com.geeksville.mesh.service.RadioNotConnectedException {
            
            public IsUpdatingException() {
                super(null);
            }
        }
    }
}