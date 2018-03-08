package tata.bfp.xml.vista;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.DOMException;

import org.xml.sax.SAXException;

public class CV01v01LecturaMapeoCash {

	public static void main(String[] args) {

        String lRuta = "D:\\2017\\04-LanguajeProgram\\Spring\\BFPSPG01v01CashManagement\\WebContent\\WEB-INF\\xml\\";
        //String lArchivo = "mapeo_programas_cash_desarrollo.xml"; // Archivo en desarrollo
        // String lArchivo = "mapeo_programas_cash_calidad.xml"; // Archivo en calidad
        String lArchivo = "mapeo_programas_cash_produccion.xml"; // Archivo en Producción
        
        String lArchivoXml = lRuta + lArchivo;
        
        File oArchivoXml = new File(lArchivoXml);
        System.out.println(oArchivoXml.getAbsolutePath()+"\n");
        
        try{
            System.out.println("Lectura del Archivo xml que tiene un Id");
            System.out.println("=======================================");
            
            // 2.0 Crear un DocumentBuilder
            DocumentBuilderFactory oDBFactory = DocumentBuilderFactory.newInstance();
            
            DocumentBuilder oDBuilder = oDBFactory.newDocumentBuilder();
            
            // 3.0 Crear un documento a partir de un archivo o emisión
            Document oDoc = oDBuilder.parse(lArchivoXml);

            System.out.println("Archivo" + oArchivoXml);

            oDoc.getDocumentElement().normalize();
            
            // 4.0 Cargando el nodo principal
            System.out.println("Elemento Raíz   : " + oDoc.getDocumentElement().getNodeName());
            
            // 5.0 Devuelve atributos
            NodeList nList = oDoc.getElementsByTagName("transaccion");
            
            System.out.println("----------------------------");

            // 6.0 Devuelve Elementos
            
            System.out.println("Id Transacción      : Código Transacción  : Longitud            : Programa IBS        : Descripción         : ");
            
            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

//                System.out.println("\nElemento Actual : " + "(" + temp + ")" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                        Element eElement = (Element) nNode;

                        System.out.println(eElement.getElementsByTagName("idTrx").item(0).getTextContent() + '|' +
                        				   eElement.getElementsByTagName("codTrn").item(0).getTextContent() + '|' +
                        				   eElement.getElementsByTagName("longitud").item(0).getTextContent() + '|' + 
                        				   eElement.getElementsByTagName("programa").item(0).getTextContent() + '|' +
                        				   eElement.getElementsByTagName("modulo").item(0).getTextContent());
                }
            }
        }catch(ParserConfigurationException oPCEx){
            System.out.println(oPCEx.getMessage());
        } catch (SAXException oSAXEx) {
            System.out.println(oSAXEx.getMessage());
        } catch (IOException oIOEx) {
            System.out.println(oIOEx.getMessage());
        } catch (DOMException oDOMEx) {
            System.out.println(oDOMEx.getMessage());
        }		

	}

}
