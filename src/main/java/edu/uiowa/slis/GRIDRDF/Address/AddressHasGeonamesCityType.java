package edu.uiowa.slis.GRIDRDF.Address;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AddressHasGeonamesCityType extends edu.uiowa.slis.GRIDRDF.TagLibSupport {
	static AddressHasGeonamesCityType currentInstance = null;
	private static final Log log = LogFactory.getLog(AddressHasGeonamesCityType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AddressHasGeonamesCityIterator theAddressHasGeonamesCityIterator = (AddressHasGeonamesCityIterator)findAncestorWithClass(this, AddressHasGeonamesCityIterator.class);
			pageContext.getOut().print(theAddressHasGeonamesCityIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Address for hasGeonamesCity tag ", e);
			throw new JspTagException("Error: Can't find enclosing Address for hasGeonamesCity tag ");
		}
		return SKIP_BODY;
	}
}

