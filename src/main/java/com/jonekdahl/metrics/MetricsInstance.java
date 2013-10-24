package com.jonekdahl.metrics;

import com.codahale.metrics.MetricRegistry;

public class MetricsInstance {
	private static final MetricRegistry INSTANCE = new MetricRegistry();
	
	public static MetricRegistry get() {
		return INSTANCE;
	}
}