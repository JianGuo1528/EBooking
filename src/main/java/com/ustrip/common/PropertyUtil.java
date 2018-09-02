package com.ustrip.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class PropertyUtil {
    private static Logger logger = LogManager.getLogger(PropertyUtil.class.getName());
    private static Properties templateProps;

    static {
        loadProps();
    }

    synchronized static private void loadProps() {
        logger.info("starting to load the properties file...");
        templateProps = new Properties();
        InputStreamReader in = null;
        try {
            in = new InputStreamReader(PropertyUtil.class.getClassLoader().getResourceAsStream("ctrip_template.properties"), "UTF-8");
            templateProps.load(in);
        } catch (IOException e) {
            logger.error(e.getMessage());
        } finally {
            try {
                if (null != in) {
                    in.close();
                }
            } catch (IOException e) {
                logger.error(e.getMessage());
            }
        }
        logger.info("finishing to load the properties file...");
    }

    public static Properties getTemplateProps() {
        if (null == templateProps) {
            loadProps();
        }
        return templateProps;
    }
}
