/*
 * @(#)EventPublisherAware.java Dec 13, 2009
 * 
 * Copyright 2008 Painiu. All rights reserved.
 */
package com.painiu.event;

/**
 * <p>
 * <a href="EventPublisherAware.java.html"><i>View Source</i></a>
 * </p>
 *
 * @author Zhang Songfu
 * @version $Id: EventPublisherAware.java 35 2010-06-01 01:53:10Z zhangsf $
 */
public interface EventPublisherAware {
	
	public void setEventPublisher(EventPublisher publisher);
}
