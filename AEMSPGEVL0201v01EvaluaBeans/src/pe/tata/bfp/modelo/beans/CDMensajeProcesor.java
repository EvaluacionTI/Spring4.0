package pe.tata.bfp.modelo.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CDMensajeProcesor implements BeanPostProcessor {

	public CDMensajeProcesor() {
		
	}

	@Override
	public Object postProcessAfterInitialization(Object pBean, String pNombreBean) throws BeansException {
		System.out.println("AfterInitialization : " + pNombreBean);
		return pNombreBean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object pBean, String pNombreBean) throws BeansException {
		System.out.println("BeforeInitialization : " + pNombreBean);
		return pNombreBean;
	}

}
