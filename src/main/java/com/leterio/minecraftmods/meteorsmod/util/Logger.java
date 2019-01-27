package com.leterio.minecraftmods.meteorsmod.util;

import java.util.function.Supplier;

import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

import com.leterio.minecraftmods.meteorsmod.MeteorsMod;

public final class Logger {
	private Logger() {}

	private static org.apache.logging.log4j.Logger logger;
	private static final Marker MOD_MARKER = MarkerManager.getMarker(MeteorsMod.MODID);

	public static void error(Supplier<String> message) {
		if (logger.isErrorEnabled()) {
			logger.error(MOD_MARKER, message.get());
		}
	}

	public static void error(Supplier<String> message, Throwable t) {
		if (logger.isErrorEnabled()) {
			logger.error(MOD_MARKER, message.get(), t);
		}
	}

	public static void warn(Supplier<String> message) {
		if (logger.isWarnEnabled()) {
			logger.warn(MOD_MARKER, message.get());
		}
	}

	public static void warn(Supplier<String> message, Throwable t) {
		if (logger.isWarnEnabled()) {
			logger.warn(MOD_MARKER, message.get(), t);
		}
	}

	public static void info(Supplier<String> message) {
		if (logger.isInfoEnabled()) {
			logger.info(MOD_MARKER, message.get());
		}
	}

	public static void info(Supplier<String> message, Throwable t) {
		if (logger.isInfoEnabled()) {
			logger.info(MOD_MARKER, message.get(), t);
		}
	}

	public static void debug(Supplier<String> message) {
		if (logger.isDebugEnabled() || MeteorsMod.DEBUG_MODE) {
			if (MeteorsMod.DEBUG_MODE) {
				logger.info(MOD_MARKER, message.get());
			} else {
				logger.debug(MOD_MARKER, message.get());
			}
		}
	}

	public static void debug(Supplier<String> message, Throwable t) {
		if (logger.isDebugEnabled() || MeteorsMod.DEBUG_MODE) {
			if (MeteorsMod.DEBUG_MODE) {
				logger.info(MOD_MARKER, message.get(), t);
			} else {
				logger.debug(MOD_MARKER, message.get(), t);
			}
		}
	}

	public static void setLogger(final org.apache.logging.log4j.Logger logger) {
		if (Logger.logger != null) {
			throw new IllegalStateException("Attempt to replace logger");
		}
		Logger.logger = logger;
	}
}
