package com.ustrip.common;

import java.text.DecimalFormat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ustrip.common.ErrorCodeEnum;
import com.ustrip.common.MiniException;
import com.ustrip.common.UsiTripConstant;
import com.ustrip.entity.Partner;

/**
 * @author Arthur
 */

public class AjustPrice {
	private static Logger logger = LogManager.getLogger(AjustPrice.class.getName());
	
	/*public static double increaseNetPrice(Partner partner, double netPrice) throws Exception
    {
    	try {
			double priceRatio = partner.getPriceRatio();
			DecimalFormat dec = new DecimalFormat("#0.00");
			double rtv=netPrice * (1 + priceRatio);
			return Double.parseDouble(dec.format(rtv));
		} catch (Exception e) {
			logger.fatal("increaseNetPrice encouter fetal error!");
			e.printStackTrace();
			throw new MiniException(UsiTripConstant.ERRORCODE_ER1302, ErrorCodeEnum.ER1302.getMsg());
		}
    }

	public static double increaseExpediaNetPrice(Partner partner, double netPrice) throws Exception
    {
    	try {
    		//String fix = Utility.getConfigValue(UsiTripConstant.EXPEDIA_FIX);
    		//double fix_d = new Double(fix);
    		double fix_d = new Double(0);
			//double priceRatio = partner.getPriceRatio();
			DecimalFormat dec = new DecimalFormat("#0.00");
			//double rtv=netPrice * (1-fix_d) * (1 + priceRatio);
			double rtv=netPrice * (1-fix_d) ;
			return Double.parseDouble(dec.format(rtv));
		} catch (Exception e) {
			logger.fatal("increaseNetPrice encouter fetal error!");
			e.printStackTrace();
			throw new MiniException(UsiTripConstant.ERRORCODE_ER1302, ErrorCodeEnum.ER1302.getMsg());
		}
    }*/
	
	public static double increaseEBookingNetPrice(double priceRatio, double netPrice) throws Exception
    {
    	try {
			DecimalFormat dec = new DecimalFormat("#0.00");
			double rtv=netPrice * (1 + priceRatio);
			return Double.parseDouble(dec.format(rtv));
		} catch (Exception e) {
			logger.fatal("increaseEBookingNetPrice encouter fetal error!",e);
			//e.printStackTrace();
			throw e;
		}
    }
	
	public static double getBeforeTaxPrice(double netPrice) throws Exception
    {
    	try {
			DecimalFormat dec = new DecimalFormat("#0.00");
			double rtv=netPrice / (1.15);
			return Double.parseDouble(dec.format(rtv));
		} catch (Exception e) {
			logger.fatal("getBeforeTaxPrice encouter fetal error!",e);
			//e.printStackTrace();
			throw e;
		}
    }
}
