package edu.uiowa.slis.GRIDRDF.Healthcare;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HealthcareHasAddressType extends edu.uiowa.slis.GRIDRDF.TagLibSupport {
	static HealthcareHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(HealthcareHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			HealthcareHasAddressIterator theHealthcareHasAddressIterator = (HealthcareHasAddressIterator)findAncestorWithClass(this, HealthcareHasAddressIterator.class);
			pageContext.getOut().print(theHealthcareHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Healthcare for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Healthcare for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

