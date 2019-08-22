package com.superg280.dev.xfshelper;

import android.content.Context;

import java.util.ArrayList;

public class XFSCodes {


    public static XFSElement getXFSError( int nCode) {

        XFSElement element = new XFSElement();

        switch( nCode) {
            ///////////////////////////////////////////////////////
            //Errores genericos:
            case 0:
                element.setErrorCode( "WFS_SUCCESS");
                element.setDescription( "");
                break;
            case -1:
                element.setErrorCode( "WFS_ERR_ALREADY_STARTED");
                element.setDescription( "");
                break;
            case -2:
                element.setErrorCode( "WFS_ERR_API_VER_TOO_HIGH");
                element.setDescription( "");
                break;
            case -3:
                element.setErrorCode( "WFS_ERR_API_VER_TOO_LOW");
                element.setDescription( "");
                break;
            case -4:
                element.setErrorCode( "WFS_ERR_CANCELED");
                element.setDescription( "");
                break;
            case -5:
                element.setErrorCode( "WFS_ERR_CFG_INVALID_HKEY");
                element.setDescription( "");
                break;
            case -6:
                element.setErrorCode( "WFS_ERR_CFG_INVALID_NAME");
                element.setDescription( "");
                break;
            case -7:
                element.setErrorCode( "WFS_ERR_CFG_INVALID_SUBKEY");
                element.setDescription( "");
                break;
            case -8:
                element.setErrorCode( "WFS_ERR_CFG_INVALID_VALUE");
                element.setDescription( "");
                break;
            case -9:
                element.setErrorCode( "WFS_ERR_CFG_KEY_NOT_EMPTY");
                element.setDescription( "");
                break;
            case -10:
                element.setErrorCode( "WFS_ERR_CFG_NAME_TOO_LONG");
                element.setDescription( "");
                break;
            case -11:
                element.setErrorCode( "WFS_ERR_CFG_NO_MORE_ITEMS");
                element.setDescription( "");
                break;
            case -12:
                element.setErrorCode( "WFS_ERR_CFG_VALUE_TOO_LONG");
                element.setDescription( "");
                break;
            case -13:
                element.setErrorCode( "WFS_ERR_DEV_NOT_READY");
                element.setDescription( "");
                break;
            case -14:
                element.setErrorCode( "WFS_ERR_HARDWARE_ERROR");
                element.setDescription( "");
                break;
            case -15:
                element.setErrorCode( "WFS_ERR_INTERNAL_ERROR");
                element.setDescription( "");
                break;
            case -16:
                element.setErrorCode( "WFS_ERR_INVALID_ADDRESS");
                element.setDescription( "");
                break;
            case -17:
                element.setErrorCode( "WFS_ERR_INVALID_APP_HANDLE");
                element.setDescription( "");
                break;
            case -18:
                element.setErrorCode( "WFS_ERR_INVALID_BUFFER");
                element.setDescription( "");
                break;
            case -19:
                element.setErrorCode( "WFS_ERR_INVALID_CATEGORY");
                element.setDescription( "");
                break;
            case -20:
                element.setErrorCode( "WFS_ERR_INVALID_COMMAND");
                element.setDescription( "");
                break;
            case -21:
                element.setErrorCode( "WFS_ERR_INVALID_EVENT_CLASS");
                element.setDescription( "");
                break;
            case -22:
                element.setErrorCode( "WFS_ERR_INVALID_HSERVICE");
                element.setDescription( "");
                break;
            case -23:
                element.setErrorCode( "WFS_ERR_INVALID_HPROVIDER");
                element.setDescription( "");
                break;
            case -24:
                element.setErrorCode( "WFS_ERR_INVALID_HWND");
                element.setDescription( "");
                break;
            case -25:
                element.setErrorCode( "WFS_ERR_INVALID_HWNDREG");
                element.setDescription( "");
                break;
            case -26:
                element.setErrorCode( "WFS_ERR_INVALID_POINTER");
                element.setDescription( "");
                break;
            case -27:
                element.setErrorCode( "WFS_ERR_INVALID_REQ_ID");
                element.setDescription( "");
                break;
            case -28:
                element.setErrorCode( "WFS_ERR_INVALID_RESULT");
                element.setDescription( "");
                break;
            case -29:
                element.setErrorCode( "WFS_ERR_INVALID_SERVPROV");
                element.setDescription( "");
                break;
            case -30:
                element.setErrorCode( "WFS_ERR_INVALID_TIMER");
                element.setDescription( "");
                break;
            case -31:
                element.setErrorCode( "WFS_ERR_INVALID_TRACELEVEL");
                element.setDescription( "");
                break;
            case -32:
                element.setErrorCode( "WFS_ERR_LOCKED");
                element.setDescription( "");
                break;
            case -33:
                element.setErrorCode( "WFS_ERR_NO_BLOCKING_CALL");
                element.setDescription( "");
                break;
            case -34:
                element.setErrorCode( "WFS_ERR_NO_SERVPROV");
                element.setDescription( "");
                break;
            case -35:
                element.setErrorCode( "WFS_ERR_NO_SUCH_THREAD");
                element.setDescription( "");
                break;
            case -36:
                element.setErrorCode( "WFS_ERR_NO_TIMER");
                element.setDescription( "");
                break;
            case -37:
                element.setErrorCode( "WFS_ERR_NOT_LOCKED");
                element.setDescription( "");
                break;
            case -38:
                element.setErrorCode( "WFS_ERR_NOT_OK_TO_UNLOAD");
                element.setDescription( "");
                break;
            case -39:
                element.setErrorCode( "WFS_ERR_NOT_STARTED");
                element.setDescription( "");
                break;
            case -40:
                element.setErrorCode( "WFS_ERR_NOT_REGISTERED");
                element.setDescription( "");
                break;
            case -41:
                element.setErrorCode( "WFS_ERR_OP_IN_PROGRESS");
                element.setDescription( "");
                break;
            case -42:
                element.setErrorCode( "WFS_ERR_OUT_OF_MEMORY");
                element.setDescription( "");
                break;
            case -43:
                element.setErrorCode( "WFS_ERR_SERVICE_NOT_FOUND");
                element.setDescription( "");
                break;
            case -44:
                element.setErrorCode( "WFS_ERR_SPI_VER_TOO_HIGH");
                element.setDescription( "");
                break;
            case -45:
                element.setErrorCode( "WFS_ERR_SPI_VER_TOO_LOW");
                element.setDescription( "");
                break;
            case -46:
                element.setErrorCode( "WFS_ERR_SRVC_VER_TOO_HIGH");
                element.setDescription( "");
                break;
            case -47:
                element.setErrorCode( "WFS_ERR_SRVC_VER_TOO_LOW");
                element.setDescription( "");
                break;
            case -48:
                element.setErrorCode( "WFS_ERR_TIMEOUT");
                element.setDescription( "");
                break;
            case -49:
                element.setErrorCode( "WFS_ERR_UNSUPP_CATEGORY");
                element.setDescription( "");
                break;
            case -50:
                element.setErrorCode( "WFS_ERR_UNSUPP_COMMAND");
                element.setDescription( "");
                break;
            case -51:
                element.setErrorCode( "WFS_ERR_VERSION_ERROR_IN_SRVC");
                element.setDescription( "");
                break;
            case -52:
                element.setErrorCode( "WFS_ERR_INVALID_DATA");
                element.setDescription( "");
                break;
            case -53:
                element.setErrorCode( "WFS_ERR_SOFTWARE_ERROR");
                element.setDescription( "");
                break;
            case -54:
                element.setErrorCode( "WFS_ERR_CONNECTION_LOST");
                element.setDescription( "");
                break;
            case -55:
                element.setErrorCode( "WFS_ERR_USER_ERROR");
                element.setDescription( "");
                break;
            case -56:
                element.setErrorCode( "WFS_ERR_UNSUPP_DATA");
                element.setDescription( "");
                break;
            case -57:
                element.setErrorCode( "WFS_ERR_FRAUD_ATTEMPT");
                element.setDescription( "");
                break;
            case -58:
                element.setErrorCode( "WFS_ERR_SEQUENCE_ERROR");
                element.setDescription( "");
                break;
            case -59:
                element.setErrorCode( "WFS_ERR_AUTH_REQUIRED");
                element.setDescription( "");
                break;

            ///////////////////////////////////////////////////////
            //Errores Impresoras:
            case -100:
                element.setErrorCode( "WFS_ERR_PTR_FORMNOTFOUND");
                element.setDescription( "");
                break;
            case -101:
                element.setErrorCode( "WFS_ERR_PTR_FIELDNOTFOUND");
                element.setDescription( "");
                break;
            case -102:
                element.setErrorCode( "WFS_ERR_PTR_NOMEDIAPRESENT");
                element.setDescription( "");
                break;
            case -103:
                element.setErrorCode( "WFS_ERR_PTR_READNOTSUPPORTED");
                element.setDescription( "");
                break;
            case -104:
                element.setErrorCode( "WFS_ERR_PTR_FLUSHFAIL");
                element.setDescription( "");
                break;
            case -105:
                element.setErrorCode( "WFS_ERR_PTR_MEDIAOVERFLOW");
                element.setDescription( "");
                break;
            case -106:
                element.setErrorCode( "WFS_ERR_PTR_FIELDSPECFAILURE");
                element.setDescription( "");
                break;
            case -107:
                element.setErrorCode( "WFS_ERR_PTR_FIELDERROR");
                element.setDescription( "");
                break;
            case -108:
                element.setErrorCode( "WFS_ERR_PTR_MEDIANOTFOUND");
                element.setDescription( "");
                break;
            case -109:
                element.setErrorCode( "WFS_ERR_PTR_EXTENTNOTSUPPORTED");
                element.setDescription( "");
                break;
            case -110:
                element.setErrorCode( "WFS_ERR_PTR_MEDIAINVALID");
                element.setDescription( "");
                break;
            case -111:
                element.setErrorCode( "WFS_ERR_PTR_FORMINVALID");
                element.setDescription( "");
                break;
            case -112:
                element.setErrorCode( "WFS_ERR_PTR_FIELDINVALID");
                element.setDescription( "");
                break;
            case -113:
                element.setErrorCode( "WFS_ERR_PTR_MEDIASKEWED");
                element.setDescription( "");
                break;
            case -114:
                element.setErrorCode( "WFS_ERR_PTR_RETRACTBINFULL");
                element.setDescription( "");
                break;
            case -115:
                element.setErrorCode( "WFS_ERR_PTR_STACKERFULL");
                element.setDescription( "");
                break;
            case -116:
                element.setErrorCode( "WFS_ERR_PTR_PAGETURNFAIL");
                element.setDescription( "");
                break;
            case -117:
                element.setErrorCode( "WFS_ERR_PTR_MEDIATURNFAIL");
                element.setDescription( "");
                break;
            case -118:
                element.setErrorCode( "WFS_ERR_PTR_SHUTTERFAIL");
                element.setDescription( "");
                break;
            case -119:
                element.setErrorCode( "WFS_ERR_PTR_MEDIAJAMMED");
                element.setDescription( "");
                break;
            case -120:
                element.setErrorCode( "WFS_ERR_PTR_FILE_IO_ERROR");
                element.setDescription( "");
                break;
            case -121:
                element.setErrorCode( "WFS_ERR_PTR_CHARSETDATA");
                element.setDescription( "");
                break;
            case -122:
                element.setErrorCode( "WFS_ERR_PTR_PAPERJAMMED");
                element.setDescription( "");
                break;
            case -123:
                element.setErrorCode( "WFS_ERR_PTR_PAPEROUT");
                element.setDescription( "");
                break;
            case -124:
                element.setErrorCode( "WFS_ERR_PTR_INKOUT");
                element.setDescription( "");
                break;
            case -125:
                element.setErrorCode( "WFS_ERR_PTR_TONEROUT");
                element.setDescription( "");
                break;
            case -126:
                element.setErrorCode( "WFS_ERR_PTR_LAMPINOP");
                element.setDescription( "");
                break;
            case -127:
                element.setErrorCode( "WFS_ERR_PTR_SOURCEINVALID");
                element.setDescription( "");
                break;
            case -128:
                element.setErrorCode( "WFS_ERR_PTR_SEQUENCEINVALID");
                element.setDescription( "");
                break;
            case -129:
                element.setErrorCode( "WFS_ERR_PTR_MEDIASIZE");
                element.setDescription( "");
                break;
            case -130:
                element.setErrorCode( "WFS_ERR_PTR_INVALID_PORT");
                element.setDescription( "");
                break;
            case -131:
                element.setErrorCode( "WFS_ERR_PTR_MEDIARETAINED");
                element.setDescription( "");
                break;
            case -132:
                element.setErrorCode( "WFS_ERR_PTR_BLACKMARK");
                element.setDescription( "");
                break;
            case -133:
                element.setErrorCode( "WFS_ERR_PTR_DEFINITIONEXISTS");
                element.setDescription( "");
                break;
            case -134:
                element.setErrorCode( "WFS_ERR_PTR_MEDIAREJECTED");
                element.setDescription( "");
                break;
            case -135:
                element.setErrorCode( "WFS_ERR_PTR_MEDIARETRACTED");
                element.setDescription( "");
                break;
            case -136:
                element.setErrorCode( "WFS_ERR_PTR_MSFERROR");
                element.setDescription( "");
                break;
            case -137:
                element.setErrorCode( "WFS_ERR_PTR_NOMSF");
                element.setDescription( "");
                break;
            case -138:
                element.setErrorCode( "WFS_ERR_PTR_FILENOTFOUND");
                element.setDescription( "");
                break;
            case -139:
                element.setErrorCode( "WFS_ERR_PTR_POWERSAVETOOSHORT");
                element.setDescription( "");
                break;
            case -140:
                element.setErrorCode( "WFS_ERR_PTR_POWERSAVEMEDIAPRESENT");
                element.setDescription( "");
                break;
            case -141:
                element.setErrorCode( "WFS_ERR_PTR_PASSBOOKCLOSED");
                element.setDescription( "");
                break;
            case -142:
                element.setErrorCode( "WFS_ERR_PTR_LASTORFIRSTPAGEREACHED");
                element.setDescription( "");
                break;
            case -143:
                element.setErrorCode( "WFS_ERR_PTR_COMMANDUNSUPP");
                element.setDescription( "");
                break;
            case -144:
                element.setErrorCode( "WFS_ERR_PTR_SYNCHRONIZEUNSUPP");
                element.setDescription( "");
                break;

            ///////////////////////////////////////////////////////
            //Errores Lector tarjetas:
            case -200:
                element.setErrorCode( "WFS_ERR_IDC_MEDIAJAM");
                element.setDescription( "");
                break;
            case -201:
                element.setErrorCode( "WFS_ERR_IDC_NOMEDIA");
                element.setDescription( "");
                break;
            case -202:
                element.setErrorCode( "WFS_ERR_IDC_MEDIARETAINED");
                element.setDescription( "");
                break;
            case -203:
                element.setErrorCode( "WFS_ERR_IDC_RETAINBINFULL");
                element.setDescription( "");
                break;
            case -204:
                element.setErrorCode( "WFS_ERR_IDC_INVALIDDATA");
                element.setDescription( "");
                break;
            case -205:
                element.setErrorCode( "WFS_ERR_IDC_INVALIDMEDIA");
                element.setDescription( "");
                break;
            case -206:
                element.setErrorCode( "WFS_ERR_IDC_FORMNOTFOUND");
                element.setDescription( "");
                break;
            case -207:
                element.setErrorCode( "WFS_ERR_IDC_FORMINVALID");
                element.setDescription( "");
                break;
            case -208:
                element.setErrorCode( "WFS_ERR_IDC_DATASYNTAX");
                element.setDescription( "");
                break;
            case -209:
                element.setErrorCode( "WFS_ERR_IDC_SHUTTERFAIL");
                element.setDescription( "");
                break;
            case -210:
                element.setErrorCode( "WFS_ERR_IDC_SECURITYFAIL");
                element.setDescription( "");
                break;
            case -211:
                element.setErrorCode( "WFS_ERR_IDC_PROTOCOLNOTSUPP");
                element.setDescription( "");
                break;
            case -212:
                element.setErrorCode( "WFS_ERR_IDC_ATRNOTOBTAINED");
                element.setDescription( "");
                break;
            case -213:
                element.setErrorCode( "WFS_ERR_IDC_INVALIDKEY");
                element.setDescription( "");
                break;
            case -214:
                element.setErrorCode( "WFS_ERR_IDC_WRITE_METHOD");
                element.setDescription( "");
                break;
            case -215:
                element.setErrorCode( "WFS_ERR_IDC_CHIPPOWERNOTSUPP");
                element.setDescription( "");
                break;
            case -216:
                element.setErrorCode( "WFS_ERR_IDC_CARDTOOSHORT");
                element.setDescription( "");
                break;
            case -217:
                element.setErrorCode( "WFS_ERR_IDC_CARDTOOLONG");
                element.setDescription( "");
                break;
            case -218:
                element.setErrorCode( "WFS_ERR_IDC_INVALID_PORT");
                element.setDescription( "");
                break;
            case -219:
                element.setErrorCode( "WFS_ERR_IDC_POWERSAVETOOSHORT");
                element.setDescription( "");
                break;
            case -220:
                element.setErrorCode( "WFS_ERR_IDC_POWERSAVEMEDIAPRESENT");
                element.setDescription( "");
                break;
            case -221:
                element.setErrorCode( "WFS_ERR_IDC_CARDPRESENT");
                element.setDescription( "");
                break;
            case -222:
                element.setErrorCode( "WFS_ERR_IDC_POSITIONINVALID");
                element.setDescription( "");
                break;
            case -223:
                element.setErrorCode( "WFS_ERR_IDC_INVALIDTERMINALDATA");
                element.setDescription( "");
                break;
            case -224:
                element.setErrorCode( "WFS_ERR_IDC_INVALIDAIDDATA");
                element.setDescription( "");
                break;
            case -225:
                element.setErrorCode( "WFS_ERR_IDC_INVALIDKEYDATA");
                element.setDescription( "");
                break;
            case -226:
                element.setErrorCode( "WFS_ERR_IDC_READERNOTCONFIGURED");
                element.setDescription( "");
                break;
            case -227:
                element.setErrorCode( "WFS_ERR_IDC_TRANSACTIONNOTINITIATED");
                element.setDescription( "");
                break;
            case -228:
                element.setErrorCode( "WFS_ERR_IDC_COMMANDUNSUPP");
                element.setDescription( "");
                break;
            case -229:
                element.setErrorCode( "WFS_ERR_IDC_SYNCHRONIZEUNSUPP");
                element.setDescription( "");
                break;

            ///////////////////////////////////////////////////////
            //Errores Dispensador:
            case -300:
                element.setErrorCode( "WFS_ERR_CDM_INVALIDCURRENCY");
                element.setDescription( "");
                break;
            case -301:
                element.setErrorCode( "WFS_ERR_CDM_INVALIDTELLERID");
                element.setDescription( "");
                break;
            case -302:
                element.setErrorCode( "WFS_ERR_CDM_CASHUNITERROR");
                element.setDescription( "");
                break;
            case -303:
                element.setErrorCode( "WFS_ERR_CDM_INVALIDDENOMINATION");
                element.setDescription( "");
                break;
            case -304:
                element.setErrorCode( "WFS_ERR_CDM_INVALIDMIXNUMBER");
                element.setDescription( "");
                break;
            case -305:
                element.setErrorCode( "WFS_ERR_CDM_NOCURRENCYMIX");
                element.setDescription( "");
                break;
            case -306:
                element.setErrorCode( "WFS_ERR_CDM_NOTDISPENSABLE");
                element.setDescription( "");
                break;
            case -307:
                element.setErrorCode( "WFS_ERR_CDM_TOOMANYITEMS");
                element.setDescription( "");
                break;
            case -308:
                element.setErrorCode( "WFS_ERR_CDM_UNSUPPOSITION");
                element.setDescription( "");
                break;
            case -310:
                element.setErrorCode( "WFS_ERR_CDM_SAFEDOOROPEN");
                element.setDescription( "");
                break;
            case -312:
                element.setErrorCode( "WFS_ERR_CDM_SHUTTERNOTOPEN");
                element.setDescription( "");
                break;
            case -313:
                element.setErrorCode( "WFS_ERR_CDM_SHUTTEROPEN");
                element.setDescription( "");
                break;
            case -314:
                element.setErrorCode( "WFS_ERR_CDM_SHUTTERCLOSED");
                element.setDescription( "");
                break;
            case -315:
                element.setErrorCode( "WFS_ERR_CDM_INVALIDCASHUNIT");
                element.setDescription( "");
                break;
            case -316:
                element.setErrorCode( "WFS_ERR_CDM_NOITEMS");
                element.setDescription( "");
                break;
            case -317:
                element.setErrorCode( "WFS_ERR_CDM_EXCHANGEACTIVE");
                element.setDescription( "");
                break;
            case -318:
                element.setErrorCode( "WFS_ERR_CDM_NOEXCHANGEACTIVE");
                element.setDescription( "");
                break;
            case -319:
                element.setErrorCode( "WFS_ERR_CDM_SHUTTERNOTCLOSED");
                element.setDescription( "");
                break;
            case -320:
                element.setErrorCode( "WFS_ERR_CDM_PRERRORNOITEMS");
                element.setDescription( "");
                break;
            case -321:
                element.setErrorCode( "WFS_ERR_CDM_PRERRORITEMS");
                element.setDescription( "");
                break;
            case -322:
                element.setErrorCode( "WFS_ERR_CDM_PRERRORUNKNOWN");
                element.setDescription( "");
                break;
            case -323:
                element.setErrorCode( "WFS_ERR_CDM_ITEMSTAKEN");
                element.setDescription( "");
                break;
            case -327:
                element.setErrorCode( "WFS_ERR_CDM_INVALIDMIXTABLE");
                element.setDescription( "");
                break;
            case -328:
                element.setErrorCode( "WFS_ERR_CDM_OUTPUTPOS_NOT_EMPTY");
                element.setDescription( "");
                break;
            case -329:
                element.setErrorCode( "WFS_ERR_CDM_INVALIDRETRACTPOSITION");
                element.setDescription( "");
                break;
            case -330:
                element.setErrorCode( "WFS_ERR_CDM_NOTRETRACTAREA");
                element.setDescription( "");
                break;
            case -333:
                element.setErrorCode( "WFS_ERR_CDM_NOCASHBOXPRESENT");
                element.setDescription( "");
                break;
            case -334:
                element.setErrorCode( "WFS_ERR_CDM_AMOUNTNOTINMIXTABLE");
                element.setDescription( "");
                break;
            case -335:
                element.setErrorCode( "WFS_ERR_CDM_ITEMSNOTTAKEN");
                element.setDescription( "");
                break;
            case -336:
                element.setErrorCode( "WFS_ERR_CDM_ITEMSLEFT");
                element.setDescription( "");
                break;
            case -337:
                element.setErrorCode( "WFS_ERR_CDM_INVALID_PORT");
                element.setDescription( "");
                break;
            case -338:
                element.setErrorCode( "WFS_ERR_CDM_POWERSAVETOOSHORT");
                element.setDescription( "");
                break;
            case -339:
                element.setErrorCode( "WFS_ERR_CDM_POWERSAVEMEDIAPRESENT");
                element.setDescription( "");
                break;
            case -340:
                element.setErrorCode( "WFS_ERR_CDM_POSITION_NOT_EMPTY");
                element.setDescription( "");
                break;
            case -341:
                element.setErrorCode( "WFS_ERR_CDM_INCOMPLETERETRACT");
                element.setDescription( "");
                break;
            case -342:
                element.setErrorCode( "WFS_ERR_CDM_COMMANDUNSUPP");
                element.setDescription( "");
                break;
            case -343:
                element.setErrorCode( "WFS_ERR_CDM_SYNCHRONIZEUNSUPP");
                element.setDescription( "");
                break;

            ///////////////////////////////////////////////////////
            //Errores PinPad:
            case -400:
                element.setErrorCode( "WFS_ERR_PIN_KEYNOTFOUND");
                element.setDescription( "");
                break;
            case -401:
                element.setErrorCode( "WFS_ERR_PIN_MODENOTSUPPORTED");
                element.setDescription( "");
                break;
            case -402:
                element.setErrorCode( "WFS_ERR_PIN_ACCESSDENIED");
                element.setDescription( "");
                break;
            case -403:
                element.setErrorCode( "WFS_ERR_PIN_INVALIDID");
                element.setDescription( "");
                break;
            case -404:
                element.setErrorCode( "WFS_ERR_PIN_DUPLICATEKEY");
                element.setDescription( "");
                break;
            case -406:
                element.setErrorCode( "WFS_ERR_PIN_KEYNOVALUE");
                element.setDescription( "");
                break;
            case -407:
                element.setErrorCode( "WFS_ERR_PIN_USEVIOLATION");
                element.setDescription( "");
                break;
            case -408:
                element.setErrorCode( "WFS_ERR_PIN_NOPIN");
                element.setDescription( "");
                break;
            case -409:
                element.setErrorCode( "WFS_ERR_PIN_INVALIDKEYLENGTH");
                element.setDescription( "");
                break;
            case -410:
                element.setErrorCode( "WFS_ERR_PIN_KEYINVALID");
                element.setDescription( "");
                break;
            case -411:
                element.setErrorCode( "WFS_ERR_PIN_KEYNOTSUPPORTED");
                element.setDescription( "");
                break;
            case -412:
                element.setErrorCode( "WFS_ERR_PIN_NOACTIVEKEYS");
                element.setDescription( "");
                break;
            case -414:
                element.setErrorCode( "WFS_ERR_PIN_NOTERMINATEKEYS");
                element.setDescription( "");
                break;
            case -415:
                element.setErrorCode( "WFS_ERR_PIN_MINIMUMLENGTH");
                element.setDescription( "");
                break;
            case -416:
                element.setErrorCode( "WFS_ERR_PIN_PROTOCOLNOTSUPP");
                element.setDescription( "");
                break;
            case -417:
                element.setErrorCode( "WFS_ERR_PIN_INVALIDDATA");
                element.setDescription( "");
                break;
            case -418:
                element.setErrorCode( "WFS_ERR_PIN_NOTALLOWED");
                element.setDescription( "");
                break;
            case -419:
                element.setErrorCode( "WFS_ERR_PIN_NOKEYRAM");
                element.setDescription( "");
                break;
            case -420:
                element.setErrorCode( "WFS_ERR_PIN_NOCHIPTRANSACTIVE");
                element.setDescription( "");
                break;
            case -421:
                element.setErrorCode( "WFS_ERR_PIN_ALGORITHMNOTSUPP");
                element.setDescription( "");
                break;
            case -422:
                element.setErrorCode( "WFS_ERR_PIN_FORMATNOTSUPP");
                element.setDescription( "");
                break;
            case -423:
                element.setErrorCode( "WFS_ERR_PIN_HSMSTATEINVALID");
                element.setDescription( "");
                break;
            case -424:
                element.setErrorCode( "WFS_ERR_PIN_MACINVALID");
                element.setDescription( "");
                break;
            case -425:
                element.setErrorCode( "WFS_ERR_PIN_PROTINVALID");
                element.setDescription( "");
                break;
            case -426:
                element.setErrorCode( "WFS_ERR_PIN_FORMATINVALID");
                element.setDescription( "");
                break;
            case -427:
                element.setErrorCode( "WFS_ERR_PIN_CONTENTINVALID");
                element.setDescription( "");
                break;
            case -429:
                element.setErrorCode( "WFS_ERR_PIN_SIG_NOT_SUPP");
                element.setDescription( "");
                break;
            case -431:
                element.setErrorCode( "WFS_ERR_PIN_INVALID_MOD_LEN");
                element.setDescription( "");
                break;
            case -432:
                element.setErrorCode( "WFS_ERR_PIN_INVALIDCERTSTATE");
                element.setDescription( "");
                break;
            case -433:
                element.setErrorCode( "WFS_ERR_PIN_KEY_GENERATION_ERROR");
                element.setDescription( "");
                break;
            case -434:
                element.setErrorCode( "WFS_ERR_PIN_EMV_VERIFY_FAILED");
                element.setDescription( "");
                break;
            case -435:
                element.setErrorCode( "WFS_ERR_PIN_RANDOMINVALID");
                element.setDescription( "");
                break;
            case -436:
                element.setErrorCode( "WFS_ERR_PIN_SIGNATUREINVALID");
                element.setDescription( "");
                break;
            case -437:
                element.setErrorCode( "WFS_ERR_PIN_SNSCDINVALID");
                element.setDescription( "");
                break;
            case -438:
                element.setErrorCode( "WFS_ERR_PIN_NORSAKEYPAIR");
                element.setDescription( "");
                break;
            case -439:
                element.setErrorCode( "WFS_ERR_PIN_INVALID_PORT");
                element.setDescription( "");
                break;
            case -440:
                element.setErrorCode( "WFS_ERR_PIN_POWERSAVETOOSHORT");
                element.setDescription( "");
                break;
            case -441:
                element.setErrorCode( "WFS_ERR_PIN_INVALIDHSM");
                element.setDescription( "");
                break;
            case -442:
                element.setErrorCode( "WFS_ERR_PIN_TOOMANYFRAMES");
                element.setDescription( "");
                break;
            case -443:
                element.setErrorCode( "WFS_ERR_PIN_PARTIALFRAME");
                element.setDescription( "");
                break;
            case -444:
                element.setErrorCode( "WFS_ERR_PIN_MISSINGKEYS");
                element.setDescription( "");
                break;
            case -445:
                element.setErrorCode( "WFS_ERR_PIN_FRAMECOORD");
                element.setDescription( "");
                break;
            case -446:
                element.setErrorCode( "WFS_ERR_PIN_KEYCOORD");
                element.setDescription( "");
                break;
            case -447:
                element.setErrorCode( "WFS_ERR_PIN_FRAMEOVERLAP");
                element.setDescription( "");
                break;
            case -448:
                element.setErrorCode( "WFS_ERR_PIN_KEYOVERLAP");
                element.setDescription( "");
                break;
            case -449:
                element.setErrorCode( "WFS_ERR_PIN_TOOMANYKEYS");
                element.setDescription( "");
                break;
            case -450:
                element.setErrorCode( "WFS_ERR_PIN_KEYALREADYDEFINED");
                element.setDescription( "");
                break;
            case -451:
                element.setErrorCode( "WFS_ERR_PIN_COMMANDUNSUPP");
                element.setDescription( "");
                break;
            case -452:
                element.setErrorCode( "WFS_ERR_PIN_SYNCHRONIZEUNSUPP");
                element.setDescription( "");
                break;

            ///////////////////////////////////////////////////////
            //Errores Deposito de sobres:
            case -600:
                element.setErrorCode( "WFS_ERR_DEP_DEPFULL");
                element.setDescription( "");
                break;
            case -601:
                element.setErrorCode( "WFS_ERR_DEP_DEPJAMMED");
                element.setDescription( "");
                break;
            case -602:
                element.setErrorCode( "WFS_ERR_DEP_ENVEMPTY");
                element.setDescription( "");
                break;
            case -603:
                element.setErrorCode( "WFS_ERR_DEP_ENVJAMMED");
                element.setDescription( "");
                break;
            case -604:
                element.setErrorCode( "WFS_ERR_DEP_ENVSIZE");
                element.setDescription( "");
                break;
            case -605:
                element.setErrorCode( "WFS_ERR_DEP_NOENV");
                element.setDescription( "");
                break;
            case -606:
                element.setErrorCode( "WFS_ERR_DEP_PTRFAIL");
                element.setDescription( "");
                break;
            case -607:
                element.setErrorCode( "WFS_ERR_DEP_SHTNOTCLOSED");
                element.setDescription( "");
                break;
            case -608:
                element.setErrorCode( "WFS_ERR_DEP_SHTNOTOPENED");
                element.setDescription( "");
                break;
            case -609:
                element.setErrorCode( "WFS_ERR_DEP_CONTMISSING");
                element.setDescription( "");
                break;
            case -610:
                element.setErrorCode( "WFS_ERR_DEP_DEPUNKNOWN");
                element.setDescription( "");
                break;
            case -611:
                element.setErrorCode( "WFS_ERR_DEP_CHARSETNOTSUPP");
                element.setDescription( "");
                break;
            case -612:
                element.setErrorCode( "WFS_ERR_DEP_TONEROUT");
                element.setDescription( "");
                break;
            case -613:
                element.setErrorCode( "WFS_ERR_DEP_INVALID_PORT");
                element.setDescription( "");
                break;
            case -614:
                element.setErrorCode( "WFS_ERR_DEP_POWERSAVETOOSHORT");
                element.setDescription( "");
                break;
            case -615:
                element.setErrorCode( "WFS_ERR_DEP_POWERSAVEMEDIAPRESENT");
                element.setDescription( "");
                break;
            case -616:
                element.setErrorCode( "WFS_ERR_DEP_COMMANDUNSUPP");
                element.setDescription( "");
                break;
            case -617:
                element.setErrorCode( "WFS_ERR_DEP_SYNCHRONIZEUNSUPP");
                element.setDescription( "");
                break;

            ///////////////////////////////////////////////////////
            //Errores TTU
            case -701:
                element.setErrorCode( "WFS_ERR_TTU_FIELDERROR");
                element.setDescription( "");
                break;
            case -702:
                element.setErrorCode( "WFS_ERR_TTU_FIELDINVALID");
                element.setDescription( "");
                break;
            case -703:
                element.setErrorCode( "WFS_ERR_TTU_FIELDNOTFOUND");
                element.setDescription( "");
                break;
            case -704:
                element.setErrorCode( "WFS_ERR_TTU_FIELDSPECFAILURE");
                element.setDescription( "");
                break;
            case -705:
                element.setErrorCode( "WFS_ERR_TTU_FORMINVALID");
                element.setDescription( "");
                break;
            case -706:
                element.setErrorCode( "WFS_ERR_TTU_FORMNOTFOUND");
                element.setDescription( "");
                break;
            case -707:
                element.setErrorCode( "WFS_ERR_TTU_INVALIDLED");
                element.setDescription( "");
                break;
            case -708:
                element.setErrorCode( "WFS_ERR_TTU_KEYCANCELED");
                element.setDescription( "");
                break;
            case -709:
                element.setErrorCode( "WFS_ERR_TTU_MEDIAOVERFLOW");
                element.setDescription( "");
                break;
            case -710:
                element.setErrorCode( "WFS_ERR_TTU_RESNOTSUPP");
                element.setDescription( "");
                break;
            case -711:
                element.setErrorCode( "WFS_ERR_TTU_CHARSETDATA");
                element.setDescription( "");
                break;
            case -712:
                element.setErrorCode( "WFS_ERR_TTU_KEYINVALID");
                element.setDescription( "");
                break;
            case -713:
                element.setErrorCode( "WFS_ERR_TTU_KEYNOTSUPPORTED");
                element.setDescription( "");
                break;
            case -714:
                element.setErrorCode( "WFS_ERR_TTU_NOACTIVEKEYS");
                element.setDescription( "");
                break;
            case -715:
                element.setErrorCode( "WFS_ERR_TTU_POWERSAVETOOSHORT");
                element.setDescription( "");
                break;
            case -716:
                element.setErrorCode( "WFS_ERR_TTU_COMMANDUNSUPP");
                element.setDescription( "");
                break;
            case -717:
                element.setErrorCode( "WFS_ERR_TTU_SYNCHRONIZEUNSUPP");
                element.setDescription( "");
                break;

            //////////////////////////////
            //Errores de Sensores.
            case -801:
                element.setErrorCode( "WFS_ERR_SIU_INVALID_PORT");
                element.setDescription( "");
                break;
            case -802:
                element.setErrorCode( "WFS_ERR_SIU_SYNTAX");
                element.setDescription( "");
                break;
            case -803:
                element.setErrorCode( "WFS_ERR_SIU_PORT_ERROR");
                element.setDescription( "");
                break;
            case -804:
                element.setErrorCode( "WFS_ERR_SIU_POWERSAVETOOSHORT");
                element.setDescription( "");
                break;
            case -805:
                element.setErrorCode( "WFS_ERR_SIU_COMMANDUNSUPP");
                element.setDescription( "");
                break;
            case -806:
                element.setErrorCode( "WFS_ERR_SIU_SYNCHRONIZEUNSUPP");
                element.setDescription( "");
                break;

            //////////////////////////////
            //Errores de VDM.
            case -900:
                element.setErrorCode( "WFS_ERR_VDM_INTERFACE_NOT_AVAILABLE");
                element.setDescription( "");
                break;

            ///////////////////////////////////////////////////////
            //Errores Ingresador de efectivo:
            case -1300:
                element.setErrorCode( "WFS_ERR_CIM_INVALIDCURRENCY");
                element.setDescription( "");
                break;
            case -1301:
                element.setErrorCode( "WFS_ERR_CIM_INVALIDTELLERID");
                element.setDescription( "");
                break;
            case -1302:
                element.setErrorCode( "WFS_ERR_CIM_CASHUNITERROR");
                element.setDescription( "");
                break;
            case -1307:
                element.setErrorCode( "WFS_ERR_CIM_TOOMANYITEMS");
                element.setDescription( "");
                break;
            case -1308:
                element.setErrorCode( "WFS_ERR_CIM_UNSUPPOSITION");
                element.setDescription( "");
                break;
            case -1310:
                element.setErrorCode( "WFS_ERR_CIM_SAFEDOOROPEN");
                element.setDescription( "");
                break;
            case -1312:
                element.setErrorCode( "WFS_ERR_CIM_SHUTTERNOTOPEN");
                element.setDescription( "");
                break;
            case -1313:
                element.setErrorCode( "WFS_ERR_CIM_SHUTTEROPEN");
                element.setDescription( "");
                break;
            case -1314:
                element.setErrorCode( "WFS_ERR_CIM_SHUTTERCLOSED");
                element.setDescription( "");
                break;
            case -1315:
                element.setErrorCode( "WFS_ERR_CIM_INVALIDCASHUNIT");
                element.setDescription( "");
                break;
            case -1316:
                element.setErrorCode( "WFS_ERR_CIM_NOITEMS");
                element.setDescription( "");
                break;
            case -1317:
                element.setErrorCode( "WFS_ERR_CIM_EXCHANGEACTIVE");
                element.setDescription( "");
                break;
            case -1318:
                element.setErrorCode( "WFS_ERR_CIM_NOEXCHANGEACTIVE");
                element.setDescription( "");
                break;
            case -1319:
                element.setErrorCode( "WFS_ERR_CIM_SHUTTERNOTCLOSED");
                element.setDescription( "");
                break;
            case -1323:
                element.setErrorCode( "WFS_ERR_CIM_ITEMSTAKEN");
                element.setDescription( "");
                break;
            case -1325:
                element.setErrorCode( "WFS_ERR_CIM_CASHINACTIVE");
                element.setDescription( "");
                break;
            case -1326:
                element.setErrorCode( "WFS_ERR_CIM_NOCASHINACTIVE");
                element.setDescription( "");
                break;
            case -1328:
                element.setErrorCode( "WFS_ERR_CIM_POSITION_NOT_EMPTY");
                element.setDescription( "");
                break;
            case -1334:
                element.setErrorCode( "WFS_ERR_CIM_INVALIDRETRACTPOSITION");
                element.setDescription( "");
                break;
            case -1335:
                element.setErrorCode( "WFS_ERR_CIM_NOTRETRACTAREA");
                element.setDescription( "");
                break;
            case -1336:
                element.setErrorCode( "WFS_ERR_CIM_INVALID_PORT");
                element.setDescription( "");
                break;
            case -1337:
                element.setErrorCode( "WFS_ERR_CIM_FOREIGN_ITEMS_DETECTED");
                element.setDescription( "");
                break;
            case -1338:
                element.setErrorCode( "WFS_ERR_CIM_LOADFAILED");
                element.setDescription( "");
                break;
            case -1339:
                element.setErrorCode( "WFS_ERR_CIM_CASHUNITNOTEMPTY");
                element.setDescription( "");
                break;
            case -1340:
                element.setErrorCode( "WFS_ERR_CIM_INVALIDREFSIG");
                element.setDescription( "");
                break;
            case -1341:
                element.setErrorCode( "WFS_ERR_CIM_INVALIDTRNSIG");
                element.setDescription( "");
                break;
            case -1342:
                element.setErrorCode( "WFS_ERR_CIM_POWERSAVETOOSHORT");
                element.setDescription( "");
                break;
            case -1343:
                element.setErrorCode( "WFS_ERR_CIM_POWERSAVEMEDIAPRESENT");
                element.setDescription( "");
                break;
            case -1344:
                element.setErrorCode( "WFS_ERR_CIM_DEVICELOCKFAILURE");
                element.setDescription( "");
                break;
            case -1345:
                element.setErrorCode( "WFS_ERR_CIM_TOOMANYITEMSTOCOUNT");
                element.setDescription( "");
                break;
            case -1346:
                element.setErrorCode( "WFS_ERR_CIM_COUNTPOSNOTEMPTY");
                element.setDescription( "");
                break;
            case -1347:
                element.setErrorCode( "WFS_ERR_CIM_MEDIAINACTIVE");
                element.setDescription( "");
                break;
            case -1348:
                element.setErrorCode( "WFS_ERR_CIM_COMMANDUNSUPP");
                element.setDescription( "");
                break;
            case -1349:
                element.setErrorCode( "WFS_ERR_CIM_SYNCHRONIZEUNSUPP");
                element.setDescription( "");
                break;

            ///////////////////////////////////////////////////////
            //Errores Barcode Reader:
            case -1500:
                element.setErrorCode( "WFS_ERR_BCR_BARCODEINVALID");
                element.setDescription( "");
                break;
            case -1501:
                element.setErrorCode( "WFS_ERR_BCR_INVALID_PORT");
                element.setDescription( "");
                break;
            case -1502:
                element.setErrorCode( "WFS_ERR_BCR_POWERSAVETOOSHORT");
                element.setDescription( "");
                break;
            case -1503:
                element.setErrorCode( "WFS_ERR_BCR_COMMANDUNSUPP");
                element.setDescription( "");
                break;
            case -1504:
                element.setErrorCode( "WFS_ERR_BCR_SYNCHRONIZEUNSUPP");
                element.setDescription( "");
                break;

        }

        return element;
    }

    public static XFSElement getXFSCommandResult( int nCode, boolean bExecute, Context context) {

        XFSElement element = new XFSElement();

        switch( nCode) {

            ///////////////////////////////////////
            //Eventos de System
            case 1:
                element.setErrorCode("WFS_SYSE_UNDELIVERABLE_MSG");
                element.setDescription( "");
                break;
            case 2:
                element.setErrorCode("WFS_SYSE_HARDWARE_ERROR");
                element.setDescription( "");
                break;
            case 3:
                element.setErrorCode("WFS_SYSE_VERSION_ERROR");
                element.setDescription( "");
                break;
            case 4:
                element.setErrorCode("WFS_SYSE_DEVICE_STATUS");
                element.setDescription( "");
                break;
            case 5:
                element.setErrorCode("WFS_SYSE_APP_DISCONNECT");
                element.setDescription( "");
                break;
            case 6:
                element.setErrorCode("WFS_SYSE_SOFTWARE_ERROR");
                element.setDescription( "");
                break;
            case 7:
                element.setErrorCode("WFS_SYSE_USER_ERROR");
                element.setDescription( "");
                break;
            case 8:
                element.setErrorCode("WFS_SYSE_LOCK_REQUESTED");
                element.setDescription( "");
                break;
            case 9:
                element.setErrorCode("WFS_SYSE_FRAUD_ATTEMPT");
                element.setDescription( "");

            case 11:
                element.setErrorCode("");
                element.setDescription( "");

            case 12:
                element.setErrorCode("");
                element.setDescription( "");
                break;

            ///////////////////////////////////////
            //Comandos y eventos de Impresora
            case 101:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_CONTROL_MEDIA" : "WFS_INF_PTR_STATUS");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_PTR_NOMEDIA");
                break;
            case 102:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_PRINT_FORM" : "WFS_INF_PTR_CAPABILITIES");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_PTR_MEDIAINSERTED");
                break;
            case 103:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_READ_FORM" : "WFS_INF_PTR_FORM_LIST");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_PTR_FIELDERROR");
                break;
            case 104:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_RAW_DATA" : "WFS_INF_PTR_MEDIA_LIST");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_PTR_FIELDWARNING");
                break;
            case 105:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_MEDIA_EXTENTS" : "WFS_INF_PTR_QUERY_FORM");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_USRE_PTR_RETRACTBINTHRESHOLD");
                break;
            case 106:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_RESET_COUNT" : "WFS_INF_PTR_QUERY_MEDIA");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_PTR_MEDIATAKEN");
                break;
            case 107:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_READ_IMAGE" : "WFS_INF_PTR_QUERY_FIELD");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_USRE_PTR_PAPERTHRESHOLD");
                break;
            case 108:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_RESET" : "WFS_INF_PTR_CODELINE_MAPPING");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_USRE_PTR_TONERTHRESHOLD");
                break;
            case 109:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_RETRACT_MEDIA" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_PTR_MEDIAINSERTED");
                break;
            case 110:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_DISPENSE_PAPER" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_PTR_MEDIAINSERTED");
                break;
            case 111:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_SET_GUIDANCE_LIGHT" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_USRE_PTR_INKTHRESHOLD");
                break;
            case 112:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_PRINT_RAW_FILE" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_PTR_MEDIADETECTED");
                break;
            case 113:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_LOAD_DEFINITION" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_PTR_RETRACTBINSTATUS");
                break;
            case 114:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_SUPPLY_REPLENISH" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_PTR_MEDIAPRESENTED");
                break;
            case 115:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_POWER_SAVE_CONTROL" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_PTR_DEFINITIONLOADED");
                break;
            case 116:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_CONTROL_PASSBOOK" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_PTR_MEDIAREJECTED");
                break;
            case 117:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_SET_BLACK_MARK_MODE" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_PTR_MEDIAPRESENTED");
                break;
            case 118:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_SYNCHRONIZE_COMMAND" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_PTR_MEDIAAUTORETRACTED");
                break;
            case 119:
                element.setErrorCode("WFS_SRVE_PTR_DEVICEPOSITION");
                element.setDescription( "");
                break;
            case 120:
                element.setErrorCode("WFS_SRVE_PTR_POWER_SAVE_CHANGE");
                element.setDescription( "");
                break;

            ///////////////////////////////////////
            //Comandos y eventos de Lector Tarjetas
            case 201:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_READ_TRACK" : "WFS_INF_IDC_STATUS");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_IDC_INVALIDTRACKDATA");
                break;
            case 202:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_WRITE_TRACK" : "WFS_INF_IDC_CAPABILITIES");
                element.setDescription( "");
                break;
            case 203:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_EJECT_CARD" : "WFS_INF_IDC_FORM_LIST");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_IDC_MEDIAINSERTED");
                break;
            case 204:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_RETAIN_CARD" : "WFS_INF_IDC_QUERY_FORM");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_IDC_MEDIAREMOVED");
                break;
            case 205:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_RESET_COUNT" : "WFS_INF_IDC_QUERY_IFM_IDENTIFIER");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_IDC_CARDACTION");
                break;
            case 206:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_SETKEY" : "WFS_INF_IDC_EMVCLESS_QUERY_APPS");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_USRE_IDC_RETAINBINTHRESHOLD");
                break;
            case 207:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_READ_RAW_DATA" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_IDC_INVALIDMEDIA");
                break;
            case 208:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_WRITE_RAW_DATA" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_IDC_MEDIARETAINED");
                break;
            case 209:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_CHIP_IO" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_IDC_MEDIADETECTED");
                break;
            case 210:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_RESET" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_IDC_RETAINBININSERTED");
                break;
            case 211:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_CHIP_POWER" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_IDC_RETAINBINREMOVED");
                break;
            case 212:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_PARSE_DATA" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_IDC_INSERTCARD");
                break;
            case 213:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_SET_GUIDANCE_LIGHT" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_IDC_DEVICEPOSITION");
                break;
            case 214:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_POWER_SAVE_CONTROL" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_IDC_POWER_SAVE_CHANGE");
                break;
            case 215:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_PARK_CARD" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_IDC_TRACKDETECTED");
                break;
            case 216:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_EMVCLESS_CONFIGURE" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_IDC_EMVCLESSREADSTATUS");
                break;
            case 217:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_EMVCLESS_PERFORM_TRANSACTION" : "");
                element.setDescription( "");
                break;
            case 218:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_EMVCLESS_ISSUERUPDATE" : "");
                element.setDescription( "");
                break;
            case 219:
                element.setErrorCode("WFS_CMD_IDC_SYNCHRONIZE_COMMAND");
                element.setDescription( "");
                break;

            ///////////////////////////////////////
            //Comandos y eventos de Dispensador
            case 301:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_DENOMINATE" : "WFS_INF_CDM_STATUS");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_CDM_SAFEDOOROPEN");
                break;
            case 302:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_DISPENSE" : "WFS_INF_CDM_CAPABILITIES");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_CDM_SAFEDOORCLOSED");
                break;
            case 303:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_PRESENT" : "WFS_INF_CDM_CASH_UNIT_INFO");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_USRE_CDM_CASHUNITTHRESHOLD");
                break;
            case 304:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_REJECT" : "WFS_INF_CDM_TELLER_INFO");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_CDM_CASHUNITINFOCHANGED");
                break;
            case 305:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_RETRACT" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_CDM_TELLERINFOCHANGED");
                break;
            case 306:
                element.setErrorCode( bExecute ? "" : "WFS_INF_CDM_CURRENCY_EXP");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_CDM_DELAYEDDISPENSE");
                break;
            case 307:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_OPEN_SHUTTER" : "WFS_INF_CDM_MIX_TYPES");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_CDM_STARTDISPENSE");
                break;
            case 308:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_CLOSE_SHUTTER" : "WFS_INF_CDM_MIX_TABLE");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_CDM_CASHUNITERROR");
                break;
            case 309:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_SET_TELLER_INFO" : "WFS_INF_CDM_PRESENT_STATUS");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_CDM_ITEMSTAKEN");
                break;
            case 310:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_SET_CASH_UNIT_INFO" : "WFS_INF_CDM_GET_ITEM_INFO");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_CDM_PARTIALDISPENSE");
                break;
            case 311:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_START_EXCHANGE" : "WFS_INF_CDM_GET_BLACKLIST");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_CDM_SUBDISPENSEOK");
                break;
            case 312:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_END_EXCHANGE" : "WFS_INF_CDM_GET_ALL_ITEMS_INFO");
                element.setDescription( "");
                break;
            case 313:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_OPEN_SAFE_DOOR" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_CDM_ITEMSPRESENTED");
                break;
            case 314:
                element.setErrorCode( bExecute ? "" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_CDM_COUNTS_CHANGED");
                break;
            case 315:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_CALIBRATE_CASH_UNIT" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_CDM_INCOMPLETEDISPENSE");
                break;
            case 316:
                element.setErrorCode( bExecute ? "" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_CDM_NOTEERROR");
                break;
            case 317:
                element.setErrorCode( bExecute ? "" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_CDM_MEDIADETECTED");
                break;
            case 318:
                element.setErrorCode( bExecute ? "" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_CDM_INPUT_P6");
                break;
            case 319:
                element.setErrorCode("");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_CDM_DEVICEPOSITION");
                break;
            case 320:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_SET_MIX_TABLE" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_CDM_POWER_SAVE_CHANGE");
                break;
            case 321:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_RESET" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_CDM_INFO_AVAILABLE");
                break;
            case 322:
                element.setErrorCode(bExecute ? "WFS_CMD_CDM_TEST_CASH_UNITS" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_CDM_INCOMPLETERETRACT");
                break;
            case 323:
                element.setErrorCode(bExecute ? "WFS_CMD_CDM_COUNT" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_CDM_SHUTTERSTATUSCHANGED");
                break;
            case 324:
                element.setErrorCode(bExecute ? "WFS_CMD_CDM_SET_GUIDANCE_LIGHT" : "");
                element.setDescription( "");
                break;
            case 325:
                element.setErrorCode(bExecute ? "WFS_CMD_CDM_POWER_SAVE_CONTROL" : "");
                element.setDescription( "");
                break;
            case 326:
                element.setErrorCode(bExecute ? "WFS_CMD_CDM_PREPARE_DISPENSE" : "");
                element.setDescription( "");
                break;
            case 327:
                element.setErrorCode(bExecute ? "WFS_CMD_CDM_SET_BLACKLIST" : "");
                element.setDescription( "");
                break;
            case 328:
                element.setErrorCode(bExecute ? "WFS_CMD_CDM_SYNCHRONIZE_COMMAND" : "");
                element.setDescription( "");
                break;

            ///////////////////////////////////////
            //Comandos y eventos de Pin pad
            case 401:
                element.setErrorCode( bExecute ? "WFS_CMD_PIN_CRYPT" : "WFS_INF_PIN_STATUS");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_PIN_KEY");
                break;
            case 402:
                element.setErrorCode( bExecute ? "" : "WFS_INF_PIN_CAPABILITIES");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_PIN_INITIALIZED");
                break;
            case 403:
                element.setErrorCode( bExecute ? "WFS_CMD_PIN_IMPORT_KEY" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_PIN_ILLEGAL_KEY_ACCESS");
                break;
            case 404:
                element.setErrorCode( bExecute ? "" : "WFS_INF_PIN_KEY_DETAIL");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_PIN_OPT_REQUIRED");
                break;
            case 405:
                element.setErrorCode( bExecute ? "WFS_CMD_PIN_GET_PIN" : "WFS_INF_PIN_FUNCKEY_DETAIL");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_PIN_HSM_TDATA_CHANGED");
                break;
            case 406:
                element.setErrorCode( bExecute ? "" : "WFS_INF_PIN_HSM_TDATA");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_PIN_CERTIFICATE_CHANGE");
                break;
            case 407:
                element.setErrorCode( bExecute ? "WFS_CMD_PIN_GET_PINBLOCK" : "WFS_INF_PIN_KEY_DETAIL_EX");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_PIN_HSM_CHANGED");
                break;
            case 408:
                element.setErrorCode( bExecute ? "WFS_CMD_PIN_GET_DATA" : "WFS_INF_PIN_SECUREKEY_DETAIL");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_PIN_ENTERDATA");
                break;
            case 409:
                element.setErrorCode( bExecute ? "WFS_CMD_PIN_INITIALIZATION" : "WFS_INF_PIN_QUERY_LOGICAL_HSM_DETAIL");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_PIN_DEVICEPOSITION");
                break;
            case 410:
                element.setErrorCode( bExecute ? "WFS_CMD_PIN_LOCAL_DES" : "WFS_INF_PIN_QUERY_PCIPTS_DEVICE_ID");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_PIN_POWER_SAVE_CHANGE");
                break;
            case 411:
                element.setErrorCode( bExecute ? "WFS_CMD_PIN_LOCAL_EUROCHEQUE" : "WFS_INF_PIN_GET_LAYOUT");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_PIN_LAYOUT");
                break;
            case 412:
                element.setErrorCode( bExecute ? "WFS_CMD_PIN_LOCAL_VISA" : "");
                element.setDescription( "");
                break;
            case 413:
                element.setErrorCode( bExecute ? "WFS_CMD_PIN_CREATE_OFFSET" : "");
                element.setDescription( "");
                break;
            case 414:
                element.setErrorCode( bExecute ? "WFS_CMD_PIN_DERIVE_KEY" : "");
                element.setDescription( "");
                break;
            case 415:
                element.setErrorCode( bExecute ? "WFS_CMD_PIN_PRESENT_IDC" : "");
                element.setDescription( "");
                break;
            case 416:
                element.setErrorCode( bExecute ? "WFS_CMD_PIN_LOCAL_BANKSYS" : "");
                element.setDescription( "");
                break;
            case 417:
                element.setErrorCode( bExecute ? "WFS_CMD_PIN_BANKSYS_IO" : "");
                element.setDescription( "");
                break;
            case 418:
                element.setErrorCode( bExecute ? "WFS_CMD_PIN_RESET" : "");
                element.setDescription( "");
                break;
            case 419:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_HSM_SET_TDATA" : "");
                element.setDescription( "");
                break;
            case 420:
                element.setErrorCode( bExecute ? "WFS_CMD_PIN_SECURE_MSG_SEND" : "");
                element.setDescription( "");
                break;
            case 421:
                element.setErrorCode( bExecute ? "WFS_CMD_PIN_SECURE_MSG_RECEIVE" : "");
                element.setDescription( "");
                break;
            case 422:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_GET_JOURNAL" : "");
                element.setDescription( "");
                break;
            case 423:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_IMPORT_KEY_EX" : "");
                element.setDescription( "");
                break;
            case 424:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_ENC_IO" : "");
                element.setDescription( "");
                break;
            case 425:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_HSM_INIT" : "");
                element.setDescription( "");
                break;
            case 426:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_IMPORT_RSA_PUBLIC_KEY" : "");
                element.setDescription( "");
                break;
            case 427:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_EXPORT_RSA_ISSUER_SIGNED_ITEM" : "");
                element.setDescription( "");
                break;
            case 428:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_IMPORT_RSA_SIGNED_DES_KEY" : "");
                element.setDescription( "");
                break;
            case 429:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_GENERATE_RSA_KEY_PAIR" : "");
                element.setDescription( "");
                break;
            case 430:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_EXPORT_RSA_EPP_SIGNED_ITEM" : "");
                element.setDescription( "");
                break;
            case 431:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_LOAD_CERTIFICATE" : "");
                element.setDescription( "");
                break;
            case 432:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_GET_CERTIFICATE" : "");
                element.setDescription( "");
                break;
            case 433:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_REPLACE_CERTIFICATE" : "");
                element.setDescription( "");
                break;
            case 434:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_START_KEY_EXCHANGE" : "");
                element.setDescription( "");
                break;
            case 435:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_IMPORT_RSA_ENCIPHERED_PKCS7_KEY" : "");
                element.setDescription( "");
                break;
            case 436:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_EMV_IMPORT_PUBLIC_KEY" : "");
                element.setDescription( "");
                break;
            case 437:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_DIGEST" : "");
                element.setDescription( "");
                break;
            case 438:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_SECUREKEY_ENTRY" : "");
                element.setDescription( "");
                break;
            case 439:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_GENERATE_KCV" : "");
                element.setDescription( "");
                break;
            case 440:
                element.setErrorCode(bExecute ? "" : "");
                element.setDescription( "");
                break;
            case 441:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_SET_GUIDANCE_LIGHT" : "");
                element.setDescription( "");
                break;
            case 442:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_MAINTAIN_PIN" : "");
                element.setDescription( "");
                break;
            case 443:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_KEYPRESS_BEEP" : "");
                element.setDescription( "");
                break;
            case 444:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_SET_PINBLOCK_DATA" : "");
                element.setDescription( "");
                break;
            case 445:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_SET_LOGICAL_HSM" : "");
                element.setDescription( "");
                break;
            case 446:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_IMPORT_KEYBLOCK" : "");
                element.setDescription( "");
                break;
            case 447:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_POWER_SAVE_CONTROL" : "");
                element.setDescription( "");
                break;
            case 448:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_LOAD_CERTIFICATE_EX" : "");
                element.setDescription( "");
                break;
            case 449:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_IMPORT_RSA_ENCIPHERED_PKCS7_KEY_EX" : "");
                element.setDescription( "");
                break;
            case 450:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_DEFINE_LAYOUT" : "");
                element.setDescription( "");
                break;
            case 451:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_START_AUTHENTICATE" : "");
                element.setDescription( "");
                break;
            case 452:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_AUTHENTICATE" : "");
                element.setDescription( "");
                break;
            case 453:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_GET_PINBLOCK_EX" : "");
                element.setDescription( "");
                break;
            case 454:
                element.setErrorCode(bExecute ? "WFS_CMD_PIN_SYNCHRONIZE_COMMAND" : "");
                element.setDescription( "");
                break;

            ///////////////////////////////////////
            //Comandos y eventos de Deposito de sobre
            case 601:
                element.setErrorCode( bExecute ? "WFS_CMD_DEP_ENTRY" : "WFS_INF_DEP_STATUS");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_DEP_ENVTAKEN");
                break;
            case 602:
                element.setErrorCode( bExecute ? "WFS_CMD_DEP_DISPENSE" : "WFS_INF_DEP_CAPABILITIES");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_DEP_ENVDEPOSITED");
                break;
            case 603:
                element.setErrorCode( bExecute ? "WFS_CMD_DEP_RETRACT" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_DEP_DEPOSITERROR");
                break;
            case 604:
                element.setErrorCode( bExecute ? "" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_USRE_DEP_DEPTHRESHOLD");
                break;
            case 605:
                element.setErrorCode( bExecute ? "WFS_CMD_DEP_RESET_COUNT" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_USRE_DEP_TONERTHRESHOLD");
                break;
            case 606:
                element.setErrorCode( bExecute ? "WFS_CMD_DEP_RESET" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_USRE_DEP_ENVTHRESHOLD");
                break;
            case 607:
                element.setErrorCode( bExecute ? "WFS_CMD_DEP_SET_GUIDANCE_LIGHT" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_DEP_CONTINSERTED");
                break;
            case 608:
                element.setErrorCode( bExecute ? "WFS_CMD_DEP_SUPPLY_REPLENISH" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_DEP_CONTREMOVED");
                break;
            case 609:
                element.setErrorCode( bExecute ? "WFS_CMD_DEP_POWER_SAVE_CONTROL" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_DEP_ENVINSERTED");
                break;
            case 610:
                element.setErrorCode( bExecute ? "WFS_CMD_DEP_SYNCHRONIZE_COMMAND" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_DEP_MEDIADETECTED");
                break;
            case 611:
                element.setErrorCode( bExecute ? "" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_DEP_INSERTDEPOSIT");
                break;
            case 612:
                element.setErrorCode( bExecute ? "" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_DEP_DEVICEPOSITION");
                break;
            case 613:
                element.setErrorCode( bExecute ? "" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_DEP_POWER_SAVE_CHANGE");
                break;

            ///////////////////////////////////////
            //Comandos y eventos de TTU
            case 701:
                element.setErrorCode( bExecute ? "WFS_CMD_TTU_BEEP" : "WFS_INF_TTU_STATUS");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_TTU_FIELDERROR");
                break;
            case 702:
                element.setErrorCode( bExecute ? "WFS_CMD_TTU_CLEARSCREEN" : "WFS_INF_TTU_CAPABILITIES");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_TTU_FIELDWARNING");
                break;
            case 703:
                element.setErrorCode( bExecute ? "WFS_CMD_TTU_DISPLIGHT" : "WFS_INF_TTU_FORM_LIST");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_TTU_KEY");
                break;
            case 704:
                element.setErrorCode( bExecute ? "WFS_CMD_TTU_SET_LED" : "WFS_INF_TTU_QUERY_FORM");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_TTU_DEVICEPOSITION");
                break;
            case 705:
                element.setErrorCode( bExecute ? "WFS_CMD_TTU_SET_RESOLUTION" : "WFS_INF_TTU_QUERY_FIELD");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_TTU_POWER_SAVE_CHANGE");
                break;
            case 706:
                element.setErrorCode( bExecute ? "WFS_CMD_TTU_WRITE_FORM" : "WFS_INF_TTU_KEY_DETAIL");
                element.setDescription( "");
                break;
            case 707:
                element.setErrorCode( bExecute ? "WFS_CMD_TTU_READ_FORM" : "");
                element.setDescription( "");
                break;
            case 708:
                element.setErrorCode( bExecute ? "WFS_CMD_TTU_WRITE" : "");
                element.setDescription( "");
                break;
            case 709:
                element.setErrorCode( bExecute ? "WFS_CMD_TTU_READ" : "");
                element.setDescription( "");
                break;
            case 710:
                element.setErrorCode( bExecute ? "WFS_CMD_TTU_RESET" : "");
                element.setDescription( "");
                break;
            case 711:
                element.setErrorCode( bExecute ? "WFS_CMD_TTU_DEFINE_KEYS" : "");
                element.setDescription( "");
                break;
            case 712:
                element.setErrorCode( bExecute ? "WFS_CMD_TTU_POWER_SAVE_CONTROL" : "");
                element.setDescription( "");
                break;
            case 713:
                element.setErrorCode( bExecute ? "WFS_CMD_TTU_SET_LED_EX" : "");
                element.setDescription( "");
                break;
            case 714:
                element.setErrorCode( bExecute ? "WFS_CMD_TTU_SYNCHRONIZE_COMMAND" : "");
                element.setDescription( "");
                break;

            ///////////////////////////////////////
            //Comandos y eventos de SIU
            case 801:
                element.setErrorCode( bExecute ? "WFS_CMD_SIU_ENABLE_EVENTS" : "WFS_INF_SIU_STATUS");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_SIU_PORT_STATUS");
                break;
            case 802:
                element.setErrorCode( bExecute ? "WFS_CMD_SIU_SET_PORTS" : "WFS_INF_SIU_CAPABILITIES");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_SIU_PORT_ERROR");
                break;
            case 803:
                element.setErrorCode( bExecute ? "WFS_CMD_SIU_SET_DOOR" : "WFS_INF_SIU_GET_AUTOSTARTUP_TIME");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_SIU_POWER_SAVE_CHANGE");
                break;
            case 804:
                element.setErrorCode( bExecute ? "WFS_CMD_SIU_SET_INDICATOR" : "");
                element.setDescription( "");
                break;
            case 805:
                element.setErrorCode( bExecute ? "WFS_CMD_SIU_SET_AUXILIARY" : "");
                element.setDescription( "");
                break;
            case 806:
                element.setErrorCode( bExecute ? "WFS_CMD_SIU_SET_GUIDLIGHT" : "");
                element.setDescription( "");
                break;
            case 807:
                element.setErrorCode( bExecute ? "WFS_CMD_SIU_RESET" : "");
                element.setDescription( "");
                break;
            case 808:
                element.setErrorCode( bExecute ? "WFS_CMD_SIU_POWER_SAVE_CONTROL" : "");
                element.setDescription( "");
                break;
            case 809:
                element.setErrorCode( bExecute ? "WFS_CMD_SIU_SET_AUTOSTARTUP_TIME" : "");
                element.setDescription( "");
                break;
            case 810:
                element.setErrorCode( bExecute ? "WFS_CMD_SIU_SYNCHRONIZE_COMMAND" : "");
                element.setDescription( "");
                break;

            ///////////////////////////////////////
            //Comandos y eventos de VDM
            case 901:
                element.setErrorCode( bExecute ? "WFS_CMD_VDM_ENTER_MODE_REQ" : "WFS_INF_VDM_STATUS");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_VDM_ENTER_MODE_REQ");
                break;
            case 902:
                element.setErrorCode( bExecute ? "WFS_CMD_VDM_ENTER_MODE_ACK" : "WFS_INF_VDM_CAPABILITIES");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_VDM_EXIT_MODE_REQ");
                break;
            case 903:
                element.setErrorCode( bExecute ? "WFS_CMD_VDM_EXIT_MODE_REQ" : "WFS_INF_VDM_ACTIVE_INTERFACE");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SYSE_VDM_MODEENTERED");
                break;
            case 904:
                element.setErrorCode( bExecute ? "WFS_CMD_VDM_EXIT_MODE_ACK" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SYSE_VDM_MODEEXITED");
                break;
            case 905:
                element.setErrorCode( bExecute ? "WFS_CMD_VDM_SET_ACTIVE_INTERFACE" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_VDM_INTERFACE_CHANGED");
                break;

            ///////////////////////////////////////
            //Comandos y eventos del Ingresador de efectivo
            case 1301:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_CASH_IN_START" : "WFS_INF_CIM_STATUS");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_CIM_SAFEDOOROPEN");
                break;
            case 1302:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_CASH_IN" : "WFS_INF_CIM_CAPABILITIES");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_CIM_SAFEDOORCLOSED");
                break;
            case 1303:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_CASH_IN_END" : "WFS_INF_CIM_CASH_UNIT_INFO");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_USRE_CIM_CASHUNITTHRESHOLD");
                break;
            case 1304:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_CASH_IN_ROLLBACK" : "WFS_INF_CIM_TELLER_INFO");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_CIM_CASHUNITINFOCHANGED");
                break;
            case 1305:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_RETRACT" : "WFS_INF_CIM_CURRENCY_EXP");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_CIM_TELLERINFOCHANGED");
                break;
            case 1306:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_OPEN_SHUTTER" : "WFS_INF_CIM_BANKNOTE_TYPES");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_CIM_CASHUNITERROR");
                break;
            case 1307:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_CLOSE_SHUTTER" : "WFS_INF_CIM_CASH_IN_STATUS");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_CIM_ITEMSTAKEN");
                break;
            case 1308:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_SET_TELLER_INFO" : "WFS_INF_CIM_GET_P6_INFO");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_CIM_COUNTS_CHANGED");
                break;
            case 1309:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_SET_CASH_UNIT_INFO" : "WFS_INF_CIM_GET_P6_SIGNATURE");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_CIM_INPUTREFUSE");
                break;
            case 1310:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_START_EXCHANGE" : "WFS_INF_CIM_GET_ITEM_INFO");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_CIM_ITEMSPRESENTED");
                break;
            case 1311:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_END_EXCHANGE" : "WFS_INF_CIM_POSITION_CAPABILITIES");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_CIM_ITEMSINSERTED");
                break;
            case 1312:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_OPEN_SAFE_DOOR" : "WFS_INF_CIM_REPLENISH_TARGET");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_CIM_NOTEERROR");
                break;
            case 1313:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_RESET" : "WFS_INF_CIM_DEVICELOCK_STATUS");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_CIM_SUBCASHIN");
                break;
            case 1314:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_CONFIGURE_CASH_IN_UNITS" : "WFS_INF_CIM_CASH_UNIT_CAPABILITIES");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_CIM_MEDIADETECTED");
                break;
            case 1315:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_CONFIGURE_NOTETYPES" : "WFS_INF_CIM_DEPLETE_SOURCE");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_CIM_INPUT_P6");
                break;
            case 1316:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_CREATE_P6_SIGNATURE" : "WFS_INF_CIM_GET_ALL_ITEMS_INFO");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_CIM_INFO_AVAILABLE");
                break;
            case 1317:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_SET_GUIDANCE_LIGHT" : "WFS_INF_CIM_GET_BLACKLIST");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_CIM_INSERTITEMS");
                break;
            case 1318:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_CONFIGURE_NOTE_READER" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_CIM_DEVICEPOSITION");
                break;
            case 1319:
                element.setErrorCode(bExecute ? "WFS_CMD_CIM_COMPARE_P6_SIGNATURE" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_CIM_POWER_SAVE_CHANGE");
                break;
            case 1320:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_POWER_SAVE_CONTROL" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_CIM_INCOMPLETEREPLENISH");
                break;
            case 1321:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_REPLENISH" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_EXEE_CIM_INCOMPLETEDEPLETE");
                break;
            case 1322:
                element.setErrorCode(bExecute ? "WFS_CMD_CIM_SET_CASH_IN_LIMIT" : "");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_CIM_SHUTTERSTATUSCHANGED");
                break;
            case 1323:
                element.setErrorCode(bExecute ? "WFS_CMD_CIM_CASH_UNIT_COUNT" : "");
                element.setDescription( "");
                break;
            case 1324:
                element.setErrorCode(bExecute ? "WFS_CMD_CIM_DEVICE_LOCK_CONTROL" : "");
                element.setDescription( "");
                break;
            case 1325:
                element.setErrorCode(bExecute ? "WFS_CMD_CIM_SET_MODE" : "");
                element.setDescription( "");
                break;
            case 1326:
                element.setErrorCode(bExecute ? "WFS_CMD_CIM_PRESENT_MEDIA" : "");
                element.setDescription( "");
                break;
            case 1327:
                element.setErrorCode(bExecute ? "WFS_CMD_CIM_DEPLETE" : "");
                element.setDescription( "");
                break;
            case 1328:
                element.setErrorCode(bExecute ? "WFS_CMD_CIM_SET_BLACKLIST" : "");
                element.setDescription( "");
                break;
            case 1329:
                element.setErrorCode(bExecute ? "WFS_CMD_CIM_SYNCHRONIZE_COMMAND" : "");
                element.setDescription( "");
                break;

            ///////////////////////////////////////
            //Comandos y eventos del Codigo de barras
            case 1501:
                element.setErrorCode( bExecute ? "WFS_CMD_BCR_READ" : "WFS_INF_BCR_STATUS");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_BCR_DEVICEPOSITION");
                break;
            case 1502:
                element.setErrorCode( bExecute ? "WFS_CMD_BCR_RESET" : "WFS_INF_BCR_CAPABILITIES");
                element.setDescription( context.getString(R.string.devices_all_evento) + "WFS_SRVE_BCR_POWER_SAVE_CHANGE");
                break;
            case 1503:
                element.setErrorCode( bExecute ? "WFS_CMD_BCR_SET_GUIDANCE_LIGHT" : "");
                element.setDescription( "");
                break;
            case 1504:
                element.setErrorCode( bExecute ? "WFS_CMD_BCR_POWER_SAVE_CONTROL" : "");
                element.setDescription( "");
                break;
            case 1505:
                element.setErrorCode( bExecute ? "WFS_CMD_BCR_SYNCHRONIZE_COMMAND" : "");
                element.setDescription( "");
                break;
        }

        return element;
    }

    public static ArrayList<XFSDeviceCode> getDispenserData() {

        ArrayList<XFSDeviceCode> deviceCodes = new ArrayList<XFSDeviceCode>();

        deviceCodes.add( new XFSDeviceCode( "WFSCDMCAPS.wClass"			, ""));
        deviceCodes.add( new XFSDeviceCode( "\tWFS_SERVICE_CLASS_CDM"	, "3"));

        deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSCDMSTATUS.fwDevice"			, ""));
        deviceCodes.add( new XFSDeviceCode( "\tDEVONLINE"			, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVOFFLINE"			, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVPOWEROFF"			, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVNODEVICE"			, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVHWERROR"			, "4"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVUSERERROR"		, "5"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVBUSY"				, "6"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVFRAUDATTEMPT"		, "7"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVPOTENTIALFRAUD"	, "8"));

        deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSCDMSTATUS.fwSafeDoor"		, ""));
        deviceCodes.add( new XFSDeviceCode( "\tDOORNOTSUPPORTED"	, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tDOOROPEN"			, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tDOORCLOSED"			, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tDOORUNKNOWN"			, "5"));

        deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSCDMSTATUS.fwDispenser"		, ""));
        deviceCodes.add( new XFSDeviceCode( "\tDISPOK"				, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tDISPCUSTATE"			, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tDISPCUSTOP"			, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tDISPCUUNKNOWN"		, "3"));

        deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSCDMSTATUS.fwIntermediateStacker"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tISEMPTY"						, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tISNOTEMPTY"					, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tISNOTEMPTYCUST"				, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tISNOTEMPTYUNK"				, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tISUNKNOWN"					, "4"));
        deviceCodes.add( new XFSDeviceCode( "\tISNOTSUPPORTED"				, "5"));

        deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSCDMSTATUS.wDevicePosition"	, ""));
        deviceCodes.add( new XFSDeviceCode( "WFSCDMDEVICEPOSITION.wPosition", ""));
        deviceCodes.add( new XFSDeviceCode( "\tDEVICEINPOSITION"	, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVICENOTINPOSITION"	, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVICEPOSUNKNOWN"	, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVICEPOSNOTSUPP"	, "3"));

        deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSCDMOUTPOS.fwShutter"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tSHTCLOSED"		, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tSHTOPEN"			, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tSHTJAMMED"		, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tSHTUNKNOWN"		, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tSHTNOTSUPPORTED"	, "4"));

        deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSCDMOUTPOS.fwPositionStatus"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tPSEMPTY"				, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tPSNOTEMPTY"			, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tPSUNKNOWN"			, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tPSNOTSUPPORTED"		, "3"));

        deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSCDMOUTPOS.fwTransport"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tTPOK"			, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tTPINOP"			, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tTPUNKNOWN"		, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tTPNOTSUPPORTED"	, "3"));

        deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSCDMOUTPOS.fwTransportStatus", ""));
        deviceCodes.add( new XFSDeviceCode( "\tTPSTATEMPTY"			, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tTPSTATNOTEMPTY"		, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tTPSTATNOTEMPTYCUST"	, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tTPSTATNOTEMPTY_UNK"	, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tTPSTATNOTSUPPORTED"	, "4"));

        deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSCDMOUTPOS.fwJammedShutterPosition"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tSHUTTERPOS_NOTSUPPORTED"		, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tSHUTTERPOS_NOTJAMMED"		, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tSHUTTERPOS_OPEN"				, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tSHUTTERPOS_PARTIALLY_OPEN"	, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tSHUTTERPOS_CLOSED"			, "4"));
        deviceCodes.add( new XFSDeviceCode( "\tSHUTTERPOS_UNKNOWN"			, "5"));

        deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSCDMCAPS.fwType"						, ""));
        deviceCodes.add( new XFSDeviceCode( "\tTELLERBILL"					, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tSELFSERVICEBILL"				, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tTELLERCOIN"					, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tSELFSERVICECOIN"				, "3"));

        deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSCDMCAPS.fwRetractAreas"				, ""));
        deviceCodes.add( new XFSDeviceCode( "WFSCDMRETRACT.usRetractArea"			, ""));
        deviceCodes.add( new XFSDeviceCode( "\tRA_RETRACT"					, "0x01"));
        deviceCodes.add( new XFSDeviceCode( "\tRA_TRANSPORT"				, "0x02"));
        deviceCodes.add( new XFSDeviceCode( "\tRA_STACKER"					, "0x04"));
        deviceCodes.add( new XFSDeviceCode( "\tRA_REJECT"					, "0x08"));
        deviceCodes.add( new XFSDeviceCode( "\tRA_NOTSUPP"					, "0x10"));
        deviceCodes.add( new XFSDeviceCode( "\tRA_ITEMCASSETTE"				, "0x20"));

        deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSCDMCAPS.fwRetractTransportActions"	, ""));
        deviceCodes.add( new XFSDeviceCode( "WFSCDMCAPS.fwRetractStackerActions"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tPRESENT"						, "0x01"));
        deviceCodes.add( new XFSDeviceCode( "\tRETRACT"						, "0x02"));
        deviceCodes.add( new XFSDeviceCode( "\tREJECT"						, "0x04"));
        deviceCodes.add( new XFSDeviceCode( "\tNOTSUPP"						, "0x08"));
        deviceCodes.add( new XFSDeviceCode( "\tITEMCASSETTE"				, "0x10"));

        deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSCDMCAPS.fwMoveItems"				, ""));
        deviceCodes.add( new XFSDeviceCode( "\tFROMCU"						, "0x01"));
        deviceCodes.add( new XFSDeviceCode( "\tTOCU"						, "0x02"));
        deviceCodes.add( new XFSDeviceCode( "\tTOTRANSPORT"					, "0x04"));
        deviceCodes.add( new XFSDeviceCode( "\tTOSTACKER"					, "0x08"));

        deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSCDMCASHUNIT.usType"					, ""));
        deviceCodes.add( new XFSDeviceCode( "\tTYPENA"						, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tTYPEREJECTCASSETTE"			, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tTYPEBILLCASSETTE"			, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tTYPECOINCYLINDER"			, "4"));
        deviceCodes.add( new XFSDeviceCode( "\tTYPECOINDISPENSER"			, "5"));
        deviceCodes.add( new XFSDeviceCode( "\tTYPERETRACTCASSETTE"			, "6"));
        deviceCodes.add( new XFSDeviceCode( "\tTYPECOUPON"					, "7"));
        deviceCodes.add( new XFSDeviceCode( "\tTYPEDOCUMENT"				, "8"));
        deviceCodes.add( new XFSDeviceCode( "\tTYPEREPCONTAINER"			, "11"));
        deviceCodes.add( new XFSDeviceCode( "\tTYPERECYCLING"				, "12"));

        deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSCDMCASHUNIT.usStatus"				, ""));
        deviceCodes.add( new XFSDeviceCode( "\tSTATCUOK"					, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tSTATCUFULL"					, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tSTATCUHIGH"					, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tSTATCULOW"					, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tSTATCUEMPTY"					, "4"));
        deviceCodes.add( new XFSDeviceCode( "\tSTATCUINOP"					, "5"));
        deviceCodes.add( new XFSDeviceCode( "\tSTATCUMISSING"				, "6"));
        deviceCodes.add( new XFSDeviceCode( "\tSTATCUNOVAL"					, "7"));
        deviceCodes.add( new XFSDeviceCode( "\tSTATCUNOREF"					, "8"));
        deviceCodes.add( new XFSDeviceCode( "\tSTATCUMANIP"					, "9"));

        deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSCDMMIXTYPE.usMixType"				, ""));
        deviceCodes.add( new XFSDeviceCode( "\tMIXALGORITHM"				, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tMIXTABLE"					, "2"));

        deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSCDMMIXTYPE.usMixNumber"				, ""));
        deviceCodes.add( new XFSDeviceCode( "\tINDIVIDUAL"					, "0"));

        deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSCDMMIXTYPE.usSubType"					, ""));
        deviceCodes.add( new XFSDeviceCode( "\tMIX_MINIMUM_NUMBER_OF_BILLS"		, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tMIX_EQUAL_EMPTYING_OF_CASH_UNITS", "2"));
        deviceCodes.add( new XFSDeviceCode( "\tMIX_MAXIMUM_NUMBER_OF_CASH_UNITS", "3"));

        return deviceCodes;
    }
	
	public static ArrayList<XFSDeviceCode> getCardReaderData() {

        ArrayList<XFSDeviceCode> deviceCodes = new ArrayList<XFSDeviceCode>();

        deviceCodes.add( new XFSDeviceCode( "WFSIDCCAPS.wClass"			, ""));
        deviceCodes.add( new XFSDeviceCode( "\tWFS_SERVICE_CLASS_IDC"	, "2"));

        deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCSTATUS.fwDevice"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tDEVONLINE"			, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVOFFLINE"			, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVPOWEROFF"			, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVNODEVICE"			, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVHWERROR"			, "4"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVUSERERROR"		, "5"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVBUSY"				, "6"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVFRAUDATTEMPT"		, "7"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVPOTENTIALFRAUD"	, "8"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCSTATUS.fwMedia"					, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSIDCRETAINCARD.fwPosition"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSIDCCARDACT.wPosition"				, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSIDCSTATUS.lpwParkingStationMedia"	, ""));
		deviceCodes.add( new XFSDeviceCode( "\tMEDIAPRESENT"		, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tMEDIANOTPRESENT"		, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tMEDIAJAMMED"			, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tMEDIANOTSUPP"		, "4"));
        deviceCodes.add( new XFSDeviceCode( "\tMEDIAUNKNOWN"		, "5"));
        deviceCodes.add( new XFSDeviceCode( "\tMEDIAENTERING"		, "6"));
        deviceCodes.add( new XFSDeviceCode( "\tMEDIALATCHED"		, "7"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCSTATUS.fwRetainBin", ""));
        deviceCodes.add( new XFSDeviceCode( "\tRETAINBINOK"			, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tRETAINNOTSUPP"		, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tRETAINBINFULL"		, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tRETAINBINHIGH"		, "4"));
        deviceCodes.add( new XFSDeviceCode( "\tRETAINBINMISSING"	, "5"));
        
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCSTATUS.fwSecurity"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tSECNOTSUPP"				, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tSECNOTREADY"				, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tSECOPEN"					, "3"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCSTATUS.fwChipPower"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tCHIPONLINE"				, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tCHIPPOWEREDOFF"			, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tCHIPBUSY"				, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tCHIPNODEVICE"			, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tCHIPHWERROR"				, "4"));
		deviceCodes.add( new XFSDeviceCode( "\tCHIPNOCARD"				, "5"));
		deviceCodes.add( new XFSDeviceCode( "\tCHIPNOTSUPP"				, "6"));
		deviceCodes.add( new XFSDeviceCode( "\tCHIPUNKNOWN"				, "7"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCSTATUS.fwChipModule"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tCHIPMODOK"				, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tCHIPMODINOP"				, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tCHIPMODUNKNOWN"			, "3"));
		deviceCodes.add( new XFSDeviceCode( "\tCHIPMODNOTSUPP"			, "4"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCSTATUS.fwMagReadModule"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSIDCSTATUS.fwMagWriteModule"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tMAGMODOK"					, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tMAGMODINOP"					, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tMAGMODUNKNOWN"				, "3"));
		deviceCodes.add( new XFSDeviceCode( "\tMAGMODNOTSUPP"				, "4"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCSTATUS.fwFrontImageModule"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSIDCSTATUS.fwBackImageModule"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tIMGMODOK"						, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tIMGMODINOP"						, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tIMGMODUNKNOWN"					, "3"));
		deviceCodes.add( new XFSDeviceCode( "\tIMGMODNOTSUPP"					, "4"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCSTATUS.wDevicePosition"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSIDCDEVICEPOSITION.wPosition"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tDEVICEINPOSITION"				, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVICENOTINPOSITION"				, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVICEPOSUNKNOWN"				, "2"));
		deviceCodes.add( new XFSDeviceCode( "\tDEVICEPOSNOTSUPP"				, "3"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCCAPS.fwType"				, ""));
        deviceCodes.add( new XFSDeviceCode( "\tTYPEMOTOR"					, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tTYPESWIPE"					, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tTYPEDIP"						, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tTYPECONTACTLESS"				, "4"));
		deviceCodes.add( new XFSDeviceCode( "\tTYPELATCHEDDIP"				, "5"));
		deviceCodes.add( new XFSDeviceCode( "\tTYPEPERMANENT"				, "6"));
		deviceCodes.add( new XFSDeviceCode( "\tTYPEINTELLIGENTCONTACTLESS"	, "7"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCCAPS.fwReadTracks"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSIDCCAPS.fwWriteTracks"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSIDCCARDDATA.wDataSource", ""));
		deviceCodes.add( new XFSDeviceCode( "WFSIDCCAPS.fwChipProtocols", ""));
		deviceCodes.add( new XFSDeviceCode( "WFSIDCCAPS.fwWriteMode"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSIDCCAPS.fwChipPower"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tNOTSUPP"					, "0x00"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCCAPS.fwReadTracks"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSIDCCAPS.fwWriteTracks"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSIDCCARDDATA.wDataSource", ""));
		deviceCodes.add( new XFSDeviceCode( "WFS_CMD_IDC_READ_RAW_DATA", ""));
        deviceCodes.add( new XFSDeviceCode( "\tTRACK1"					, "0x01"));
		deviceCodes.add( new XFSDeviceCode( "\tTRACK2"					, "0x02"));
		deviceCodes.add( new XFSDeviceCode( "\tTRACK3"					, "0x04"));
		deviceCodes.add( new XFSDeviceCode( "\tFRONT_TRACK_1"			, "0x80"));
		deviceCodes.add( new XFSDeviceCode( "\tTRACK1_JIS1"				, "0x400"));
		deviceCodes.add( new XFSDeviceCode( "\tTRACK3_JIS1"				, "0x800"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCCARDDATA.wDataSource"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFS_CMD_IDC_READ_RAW_DATA"		, ""));
        deviceCodes.add( new XFSDeviceCode( "\tCHIP"					, "0x0008"));
		deviceCodes.add( new XFSDeviceCode( "\tSECURITY"				, "0x0010"));
		deviceCodes.add( new XFSDeviceCode( "\tFLUXINACTIVE"			, "0x0020"));
		deviceCodes.add( new XFSDeviceCode( "\tTRACK_WM"				, "0x8000"));
		deviceCodes.add( new XFSDeviceCode( "\tMEMORY_CHIP"				, "0x0040"));
		deviceCodes.add( new XFSDeviceCode( "\tFRONTIMAGE"				, "0x0100"));
		deviceCodes.add( new XFSDeviceCode( "\tBACKIMAGE"				, "0x0200"));
		deviceCodes.add( new XFSDeviceCode( "\tDDI"						, "0x4000"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCCAPS.fwChipProtocols"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tT0"							, "0x0001"));
		deviceCodes.add( new XFSDeviceCode( "\tT1"							, "0x0002"));
		deviceCodes.add( new XFSDeviceCode( "\tPROTOCOL_NOT_REQUIRED"		, "0x0004"));
		deviceCodes.add( new XFSDeviceCode( "\tTYPEA_PART3"					, "0x0008"));
		deviceCodes.add( new XFSDeviceCode( "\tTYPEA_PART4"					, "0x0010"));
		deviceCodes.add( new XFSDeviceCode( "\tTYPEB"						, "0x0020"));
		deviceCodes.add( new XFSDeviceCode( "\tNFC"							, "0x0040"));
		
        deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCCAPS.fwSecType"			, ""));
        deviceCodes.add( new XFSDeviceCode( "\tSECNOTSUPP"					, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tSECMMBOX"					, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tSECCIM86"					, "3"));
        
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCCAPS.fwPowerOnOption"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSIDCCAPS.fwPowerOffOption"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tNOACTION"					, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tEJECT"						, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tRETAIN"						, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tEJECTTHENRETAIN"				, "4"));
		deviceCodes.add( new XFSDeviceCode( "\tREADPOSITION"				, "5"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCCAPS.fwWriteMode"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSIDCWRITETRACK.fwWriteMethod"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSIDCCARDDATA.fwWriteMethod"		, ""));
        deviceCodes.add( new XFSDeviceCode( "\tLOCO"							, "0x0002"));
        deviceCodes.add( new XFSDeviceCode( "\tHICO"							, "0x0004"));
        deviceCodes.add( new XFSDeviceCode( "\tAUTO"							, "0x0008"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCCAPS.fwChipPower"			, ""));
		deviceCodes.add( new XFSDeviceCode( "\tPOWERCOLD"						, "0x0002"));
        deviceCodes.add( new XFSDeviceCode( "\tPOWERWARM"						, "0x0004"));
        deviceCodes.add( new XFSDeviceCode( "\tPOWEROFF"						, "0x0008"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCCAPS.fwDIPMode"				, ""));
		deviceCodes.add( new XFSDeviceCode( "\tUNKNOWN"							, "0x0001"));
		deviceCodes.add( new XFSDeviceCode( "\tEXIT"							, "0x0002"));
        deviceCodes.add( new XFSDeviceCode( "\tENTRY"							, "0x0004"));
        deviceCodes.add( new XFSDeviceCode( "\tENTRY_EXIT"						, "0x0008"));
        
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCCAPS.lpwMemoryChipProtocols"	, ""));
		deviceCodes.add( new XFSDeviceCode( "\tSIEMENS4442"						, "0x0001"));
		deviceCodes.add( new XFSDeviceCode( "\tGPM896"							, "0x0002"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCFORM.fwAction"				, ""));
		deviceCodes.add( new XFSDeviceCode( "\tACTIONREAD"						, "0x0001"));
		deviceCodes.add( new XFSDeviceCode( "\tACTIONWRITE"						, "0x0002"));
        
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCTRACKEVENT.fwStatus"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSIDCCARDDATA.wStatus"			, ""));
        deviceCodes.add( new XFSDeviceCode( "\tDATAOK"							, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tDATAMISSING"						, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tDATAINVALID"						, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tDATATOOLONG"						, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tDATATOOSHORT"					, "4"));
		deviceCodes.add( new XFSDeviceCode( "\tDATASRCNOTSUPP"					, "5"));
		deviceCodes.add( new XFSDeviceCode( "\tDATASRCMISSING"					, "6"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCCARDACT.wAction"				, ""));
        deviceCodes.add( new XFSDeviceCode( "\tCARDRETAINED"					, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tCARDEJECTED"						, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tCARDREADPOSITION"				, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tCARDJAMMED"						, "4"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCCARDDATA.lpbData"			, ""));
        deviceCodes.add( new XFSDeviceCode( "\tREADLEVEL1"						, "\'1\'"));
        deviceCodes.add( new XFSDeviceCode( "\tREADLEVEL2"						, "\'2\'"));
        deviceCodes.add( new XFSDeviceCode( "\tREADLEVEL3"						, "\'3\'"));
        deviceCodes.add( new XFSDeviceCode( "\tREADLEVEL4"						, "\'4\'"));
		deviceCodes.add( new XFSDeviceCode( "\tREADLEVEL5"						, "\'5\'"));
		deviceCodes.add( new XFSDeviceCode( "\tBADREADLEVEL"					, "\'6\'"));
		deviceCodes.add( new XFSDeviceCode( "\tNODATA"							, "\'7\'"));
		deviceCodes.add( new XFSDeviceCode( "\tDATAINVAL"						, "\'8\'"));
		deviceCodes.add( new XFSDeviceCode( "\tHWERROR"							, "\'9\'"));
		deviceCodes.add( new XFSDeviceCode( "\tNOINIT"							, "\'A\'"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCIFMIDENTIFIER.wIFMAuthority"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tIFMEMV"							, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tIFMEUROPAY"						, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tIFMVISA"							, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tIFMGIECB"						, "4"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCCAPS.fwEjectPosition"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSIDCEJECTCARD.wEjectPosition"	, ""));
		deviceCodes.add( new XFSDeviceCode( "\tEXITPOSITION"					, "0x0001"));
		deviceCodes.add( new XFSDeviceCode( "\tTRANSPORTPOSITION"				, "0x0002"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCPARKCARD.wDirection"			, ""));
		deviceCodes.add( new XFSDeviceCode( "\tPARK_IN"							, "0x0001"));
		deviceCodes.add( new XFSDeviceCode( "\tPARK_OUT"						, "0x0002"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCSTATUS.wAntiFraudModule"		, ""));
        deviceCodes.add( new XFSDeviceCode( "\tAFMNOTSUPP"						, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tAFMOK"							, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tAFMINOP"							, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tAFMDEVICEDETECTED"				, "3"));
		deviceCodes.add( new XFSDeviceCode( "\tAFMUNKNOWN"						, "4"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCEMVCLESSDATA.wTxOutcome"		, ""));
        deviceCodes.add( new XFSDeviceCode( "\tMULTIPLECARDS"					, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tAPPROVE"							, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tDECLINE"							, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tONLINEREQUEST"					, "3"));
		deviceCodes.add( new XFSDeviceCode( "\tONLINEREQUESTCOMPLETIONREQ."		, "4"));
		deviceCodes.add( new XFSDeviceCode( "\tTRYAGAIN"						, "5"));
		deviceCodes.add( new XFSDeviceCode( "\tTRYANOTHERINTERFACE"				, "6"));
		deviceCodes.add( new XFSDeviceCode( "\tENDAPPLICATION"					, "7"));
		deviceCodes.add( new XFSDeviceCode( "\tCONFIRMATIONREQUIRED"			, "8"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCEMVCLESSOUTCOME.wCardholderAction"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tNOACTION"								, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tRETAP"									, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tHOLDCARD"								, "2"));
        
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCEMVCLESSOUTCOME.wCVM"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tONLINEPIN"					, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tCONFIRMATIONCODEVERIFIED"	, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tSIGN"						, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tNOCVM"						, "3"));
		deviceCodes.add( new XFSDeviceCode( "\tNOCVMPREFERENCE."			, "4"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCEMVCLESSOUTCOME.wAlternateInterface"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tCONTACT"									, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tMAGNETICSTRIPE"							, "1"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCEMVCLESSUI.wStatus"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tNOT_READY"				, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tIDLE"					, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tREADYTOREAD"				, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tPROCESSING"				, "3"));
		deviceCodes.add( new XFSDeviceCode( "\tCARDREADOK"				, "4"));
		deviceCodes.add( new XFSDeviceCode( "\tPROCESSINGERROR"			, "5"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFSIDCEMVCLESSUI.wValueQualifier"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tAMOUNT"							, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tBALANCE"							, "1"));
		
		return deviceCodes;
	}
	
	public static ArrayList<XFSDeviceCode> getSensorsData( Context context) {

        ArrayList<XFSDeviceCode> deviceCodes = new ArrayList<XFSDeviceCode>();
		
		deviceCodes.add( new XFSDeviceCode( "WFSSIUCAPS.wClass"			, ""));
        deviceCodes.add( new XFSDeviceCode( "WFS_SERVICE_CLASS_SIU"	, "8"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwDevice"			, ""));
        deviceCodes.add( new XFSDeviceCode( "\tDEVONLINE"			, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVOFFLINE"			, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVPOWEROFF"			, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVNODEVICE"			, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVHWERROR"			, "4"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVUSERERROR"		, "5"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVBUSY"				, "6"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVFRAUDATTEMPT"		, "7"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVPOTENTIALFRAUD"	, "8"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( context.getString(R.string.devices_sensors_arrays_size)	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tWFS_SIU_SENSORS_SIZE"		, "32"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_SIU_DOORS_SIZE"			, "16"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_SIU_INDICATORS_SIZE"		, "16"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_SIU_AUXILIARIES_SIZE"	, "16"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_SIU_GUIDLIGHTS_SIZE"		, "16"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( context.getString(R.string.devices_sensors_indices_of), ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwSensors[]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUCAPS.fwSensors[]"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUENABLE.fwSensors[]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTEVENT.wPortIndex[]"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTERROR.wPortIndex[]"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tOPERATORSWITCH"				, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tTAMPER"						, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tINTTAMPER"					, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tSEISMIC"						, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tHEAT"						, "4"));
        deviceCodes.add( new XFSDeviceCode( "\tPROXIMITY"					, "5"));
        deviceCodes.add( new XFSDeviceCode( "\tAMBLIGHT"					, "6"));
        deviceCodes.add( new XFSDeviceCode( "\tENHANCEDAUDIO"				, "7"));
        deviceCodes.add( new XFSDeviceCode( "\tBOOT_SWITCH"					, "8"));
		deviceCodes.add( new XFSDeviceCode( "\tCONSUMER_DISPLAY"			, "9"));
		deviceCodes.add( new XFSDeviceCode( "\tOPERATOR_CALL_BUTTON"		, "10"));
		deviceCodes.add( new XFSDeviceCode( "\tHANDSETSENSOR"				, "11"));
		deviceCodes.add( new XFSDeviceCode( "\tGENERALINPUTPORT"			, "12"));
		deviceCodes.add( new XFSDeviceCode( "\tHEADSETMICROPHONE"			, "13"));
		deviceCodes.add( new XFSDeviceCode( "\tFASCIAMICROPHONE"			, "14"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( context.getString(R.string.devices_sensors_indices_of), ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwDoors[]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUCAPS.fwDoors[]"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUENABLE.fwDoors[]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETPORTS.fwDoors[]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETDOOR.wDoor[]"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTEVENT.wPortIndex[]"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTERROR.wPortIndex[]"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tCABINET"						, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tSAFE"						, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tVANDALSHIELD"				, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tCABINET_FRONT"				, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tCABINET_REAR"				, "4"));
        deviceCodes.add( new XFSDeviceCode( "\tCABINET_LEFT"				, "5"));
        deviceCodes.add( new XFSDeviceCode( "\tCABINET_RIGHT"				, "6"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( context.getString(R.string.devices_sensors_indices_of), ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwIndicators[]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUCAPS.fwIndicators[]"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUENABLE.fwIndicators[]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETPORTS.wIndicators[]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETINDICATOR.wIndicator[]"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTEVENT.wPortIndex[]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTERROR.wPortIndex[]"		, ""));
        deviceCodes.add( new XFSDeviceCode( "\tOPENCLOSE"						, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tFASCIALIGHT"						, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tAUDIO"							, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tHEATING"							, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tCONSUMER_DISPLAY_BACKLIGHT"		, "4"));
        deviceCodes.add( new XFSDeviceCode( "\tSIGNAGEDISPLAY"					, "5"));
        deviceCodes.add( new XFSDeviceCode( "\tTRANSINDICATOR"					, "6"));
		deviceCodes.add( new XFSDeviceCode( "\tGENERALOUTPUTPORT"				, "7"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( context.getString(R.string.devices_sensors_indices_of), ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwAuxiliaries[]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUCAPS.fwAuxiliaries[]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUENABLE.fwAuxiliaries[]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETPORTS.fwAuxiliaries[]"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETAUXILIARY.wAuxiliary[]"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTEVENT.wPortIndex[]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTERROR.wPortIndex[]"		, ""));
        deviceCodes.add( new XFSDeviceCode( "\tVOLUME"							, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tUPS"								, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tREMOTE_STATUS_MONITOR"			, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tAUDIBLE_ALARM"					, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tENHANCEDAUDIOCONTROL"			, "4"));
        deviceCodes.add( new XFSDeviceCode( "\tENHANCEDMICROPHONECONTROL"		, "5"));
        deviceCodes.add( new XFSDeviceCode( "\tMICROPHONEVOLUME"				, "6"));
		
        deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( context.getString(R.string.devices_sensors_indices_of), ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwGuidLights[]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUCAPS.fwGuidLights[]"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUENABLE.fwGuidLights[]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETPORTS.fwGuidLights[]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETGUIDLIGHT.wGuidLight[]"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTEVENT.wPortIndex[]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTERROR.wPortIndex[]"		, ""));
        deviceCodes.add( new XFSDeviceCode( "\tCARDUNIT"						, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tPINPAD"							, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tNOTESDISPENSER"					, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tCOINDISPENSER"					, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tRECEIPTPRINTER"					, "4"));
        deviceCodes.add( new XFSDeviceCode( "\tPASSBOOKPRINTER"					, "5"));
        deviceCodes.add( new XFSDeviceCode( "\tENVDEPOSITORY"					, "6"));
		deviceCodes.add( new XFSDeviceCode( "\tCHEQUEUNIT"						, "7"));
		deviceCodes.add( new XFSDeviceCode( "\tBILLACCEPTOR"					, "8"));
		deviceCodes.add( new XFSDeviceCode( "\tENVDISPENSER"					, "9"));
		deviceCodes.add( new XFSDeviceCode( "\tDOCUMENTPRINTER"					, "10"));
		deviceCodes.add( new XFSDeviceCode( "\tCOINACCEPTOR"					, "11"));
		deviceCodes.add( new XFSDeviceCode( "\tSCANNER"							, "12"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( context.getString( R.string.devices_sensors_values_of), ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwSensors[]"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwDoors[]"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwIndicators[]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwAuxiliaries[]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.wGuidLight[]"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUCAPS.fwSensors[]"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUCAPS.fwDoors[]"				, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUCAPS.fwIndicators[]"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUCAPS.fwAuxiliaries[]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUCAPS.wGuidLight[]"			, ""));
		deviceCodes.add( new XFSDeviceCode( "\tNOT_AVAILABLE"					, "0x00"));
		deviceCodes.add( new XFSDeviceCode( "\tAVAILABLE"						, "0x01"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode(context.getString( R.string.devices_sensors_values_of) + " [OPERATORSWITCH]"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwSensors"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUCAPS.fwSensors"				, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTEVENT.wPortStatus"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTERROR.wPortStatus"		, ""));
		deviceCodes.add( new XFSDeviceCode( "\tRUN"								, "0x01"));
		deviceCodes.add( new XFSDeviceCode( "\tMAINTENANCE"						, "0x02"));
		deviceCodes.add( new XFSDeviceCode( "\tSUPERVISOR"						, "0x04"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode(context.getString( R.string.devices_sensors_values_of) + " [OPENCLOSE]", ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwDoors[]"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwIndicators[]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUCAPS.fwDoors[]"				, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUCAPS.fwIndicators[]"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETPORTS.fwDoors[]"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETPORTS.fwIndicators[]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETDOOR.wDoor"				, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETINDICATOR.fwCommand"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTEVENT.wPortStatus"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTERROR.wPortStatus"		, ""));
		deviceCodes.add( new XFSDeviceCode( "\tCLOSED"							, "0x01"));
		deviceCodes.add( new XFSDeviceCode( "\tOPEN"							, "0x02"));
		deviceCodes.add( new XFSDeviceCode( "\tLOCKED"							, "0x04"));
		deviceCodes.add( new XFSDeviceCode( "\tBOLTED"							, "0x08"));
		deviceCodes.add( new XFSDeviceCode( "\tSERVICE"							, "0x10"));
		deviceCodes.add( new XFSDeviceCode( "\tKEYBOARD"						, "0x20"));
		deviceCodes.add( new XFSDeviceCode( "\tAJAR"							, "0x40"));
		deviceCodes.add( new XFSDeviceCode( "\tJAMMED"							, "0x80"));

		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode(context.getString( R.string.devices_sensors_values_of) + " [AUDIO]", ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwIndicators"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETPORTS.fwIndicators"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETINDICATOR.fwCommand"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTEVENT.wPortStatus"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTERROR.wPortStatus"	, ""));
		deviceCodes.add( new XFSDeviceCode( "\tKEYPRESS"					, "0x02"));
		deviceCodes.add( new XFSDeviceCode( "\tEXCLAMATION"					, "0x04"));
		deviceCodes.add( new XFSDeviceCode( "\tWARNING"						, "0x08"));
		deviceCodes.add( new XFSDeviceCode( "\tERROR"						, "0x10"));
		deviceCodes.add( new XFSDeviceCode( "\tCRITICAL"					, "0x20"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode(context.getString( R.string.devices_sensors_values_of) + " [CONSUMER_DISPLAY]"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwSensors"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTEVENT.wPortStatus"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTERROR.wPortStatus"	, ""));
		deviceCodes.add( new XFSDeviceCode( "\tDISPLAY_ERROR"				, "0x04"));
		
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode(context.getString( R.string.devices_sensors_flags_for) + " [TRANSINDICATOR]"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwIndicators"	 		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETPORTS.fwIndicators"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETINDICATOR.fwCommand"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTEVENT.wPortStatus"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTERROR.wPortStatus"		, ""));
		deviceCodes.add( new XFSDeviceCode( "\tLAMP1"							, "0x0001"));
		deviceCodes.add( new XFSDeviceCode( "\tLAMP2"							, "0x0002"));
		deviceCodes.add( new XFSDeviceCode( "\tLAMP3"							, "0x0004"));
		deviceCodes.add( new XFSDeviceCode( "\tLAMP4"							, "0x0008"));
		deviceCodes.add( new XFSDeviceCode( "\tLAMP5"							, "0x0010"));
		deviceCodes.add( new XFSDeviceCode( "\tLAMP6"							, "0x0020"));
		deviceCodes.add( new XFSDeviceCode( "\tLAMP7"							, "0x0040"));
		deviceCodes.add( new XFSDeviceCode( "\tLAMP8"							, "0x0080"));
		deviceCodes.add( new XFSDeviceCode( "\tLAMP9"							, "0x0100"));
		deviceCodes.add( new XFSDeviceCode( "\tLAMP10"							, "0x0200"));
		deviceCodes.add( new XFSDeviceCode( "\tLAMP11"							, "0x0400"));
		deviceCodes.add( new XFSDeviceCode( "\tLAMP12"							, "0x0800"));
		deviceCodes.add( new XFSDeviceCode( "\tLAMP13"							, "0x1000"));
		deviceCodes.add( new XFSDeviceCode( "\tLAMP14"							, "0x2000"));
		deviceCodes.add( new XFSDeviceCode( "\tLAMP15"							, "0x4000"));
		deviceCodes.add( new XFSDeviceCode( "\tLAMP16"							, "0x8000"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode(context.getString( R.string.devices_sensors_values_of) + " [REMOTE_STATUS_MONITOR]"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwAuxiliaries"	 	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETPORTS.fwAuxiliaries"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETAUXILIARY.fwCommand"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTEVENT.wPortStatus"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTERROR.wPortStatus"		, ""));
		deviceCodes.add( new XFSDeviceCode( "\tGREEN_LED_ON"					, "0x01"));
		deviceCodes.add( new XFSDeviceCode( "\tGREEN_LED_OFF"					, "0x02"));
		deviceCodes.add( new XFSDeviceCode( "\tAMBER_LED_ON"					, "0x04"));
		deviceCodes.add( new XFSDeviceCode( "\tAMBER_LED_OFF"					, "0x08"));
		deviceCodes.add( new XFSDeviceCode( "\tRED_LED_ON"						, "0x10"));
		deviceCodes.add( new XFSDeviceCode( "\tRED_LED_OFF"						, "0x20"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode(context.getString( R.string.devices_sensors_values_of)	, ""));
		deviceCodes.add( new XFSDeviceCode("[ENHANCEDAUDIOCONTROL]"				, ""));
		deviceCodes.add( new XFSDeviceCode("[ENHANCEDMICROPHONECONTROL]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETPORTS.fwAuxiliaries"	 	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwAuxiliaries"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETPORTS.fwAuxiliaries"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETAUXILIARY.fwCommand"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTEVENT.wPortStatus"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTERROR.wPortStatus"		, ""));
		deviceCodes.add( new XFSDeviceCode( "\tPUBLICAUDIO_MANUAL"				, "0x01"));
		deviceCodes.add( new XFSDeviceCode( "\tPUBLICAUDIO_AUTO"				, "0x02"));
		deviceCodes.add( new XFSDeviceCode( "\tPUBLICAUDIO_SEMI_AUTO"			, "0x04"));
		deviceCodes.add( new XFSDeviceCode( "\tPRIVATEAUDIO_MANUAL"				, "0x08"));
		deviceCodes.add( new XFSDeviceCode( "\tPRIVATEAUDIO_AUTO"				, "0x10"));
		deviceCodes.add( new XFSDeviceCode( "\tPRIVATEAUDIO_SEMI_AUTO"			, "0x20"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode(context.getString( R.string.devices_sensors_values_of)	, ""));
		deviceCodes.add( new XFSDeviceCode("WFSSIUSTATUS.fwSensors"				, ""));
		deviceCodes.add( new XFSDeviceCode("WFSSIUSTATUS.fwIndicators"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwAuxiliaries"	 	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwGuidLights"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUCAPS.fwSensors"				, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUCAPS.fwIndicators"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUCAPS.fwGuidLights"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETPORTS.fwIndicators"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETPORTS.fwAuxiliaries"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETPORTS.fwGuidLights"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETINDICATOR.fwCommand"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETAUXILIARY.fwCommand"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETGUIDLIGHT.fwCommand"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTEVENT.wPortStatus"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTERROR.wPortStatus"		, ""));
		deviceCodes.add( new XFSDeviceCode( "\tOFF"								, "0x01"));
		deviceCodes.add( new XFSDeviceCode( "\tON"								, "0x02"));
		deviceCodes.add( new XFSDeviceCode( "\tSLOW_FLASH"						, "0x04"));
		deviceCodes.add( new XFSDeviceCode( "\tMEDIUM_FLASH"					, "0x08"));
		deviceCodes.add( new XFSDeviceCode( "\tQUICK_FLASH"						, "0x10"));
		deviceCodes.add( new XFSDeviceCode( "\tCONTINUOUS"						, "0x80"));
		
		deviceCodes.add( new XFSDeviceCode( "", ""));
		deviceCodes.add( new XFSDeviceCode( context.getString( R.string.devices_sensors_flags_for)	, ""));
		deviceCodes.add( new XFSDeviceCode( "[GENERALINPUTPORT]"			, ""));
		deviceCodes.add( new XFSDeviceCode( "[GENERALOUTPUTPORT]"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwSensors"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwIndicators"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETPORTS.fwIndicators"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETINDICATOR.fwCommand"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTEVENT.wPortStatus"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTERROR.wPortStatus"	, ""));
		deviceCodes.add( new XFSDeviceCode( "\tGPP1"							, "0x0001"));
		deviceCodes.add( new XFSDeviceCode( "\tGPP2"							, "0x0002"));
		deviceCodes.add( new XFSDeviceCode( "\tGPP3"							, "0x0004"));
		deviceCodes.add( new XFSDeviceCode( "\tGPP4"							, "0x0008"));
		deviceCodes.add( new XFSDeviceCode( "\tGPP5"							, "0x0010"));
		deviceCodes.add( new XFSDeviceCode( "\tGPP6"							, "0x0020"));
		deviceCodes.add( new XFSDeviceCode( "\tGPP7"							, "0x0040"));
		deviceCodes.add( new XFSDeviceCode( "\tGPP8"							, "0x0080"));
		deviceCodes.add( new XFSDeviceCode( "\tGPP9"							, "0x0100"));
		deviceCodes.add( new XFSDeviceCode( "\tGPP10"							, "0x0200"));
		deviceCodes.add( new XFSDeviceCode( "\tGPP11"							, "0x0400"));
		deviceCodes.add( new XFSDeviceCode( "\tGPP12"							, "0x0800"));
		deviceCodes.add( new XFSDeviceCode( "\tGPP13"							, "0x1000"));
		deviceCodes.add( new XFSDeviceCode( "\tGPP14"							, "0x2000"));
		deviceCodes.add( new XFSDeviceCode( "\tGPP15"							, "0x4000"));
		deviceCodes.add( new XFSDeviceCode( "\tGPP16"							, "0x8000"));
		
		deviceCodes.add( new XFSDeviceCode( "", ""));
		deviceCodes.add( new XFSDeviceCode( context.getString( R.string.devices_sensors_values_of), ""));
		deviceCodes.add( new XFSDeviceCode( "[PROXIMITY]"					, ""));
		deviceCodes.add( new XFSDeviceCode( "[ENHANCEDAUDIO]"				, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwSensors"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTEVENT.wPortStatus"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTERROR.wPortStatus"	, ""));
		deviceCodes.add( new XFSDeviceCode( "\tPRESENT"						, "0x01"));
		deviceCodes.add( new XFSDeviceCode( "\tNOT_PRESENT"					, "0x02"));
		
		deviceCodes.add( new XFSDeviceCode( "", ""));
		deviceCodes.add( new XFSDeviceCode( context.getString( R.string.devices_sensors_values_of) + " [HANDSETSENSOR]"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwSensors"			, ""));
		deviceCodes.add( new XFSDeviceCode( "\tOFF_THE_HOOK"					, "0x01"));
		deviceCodes.add( new XFSDeviceCode( "\tON_THE_HOOK"						, "0x02"));
		
		deviceCodes.add( new XFSDeviceCode( "", ""));
		deviceCodes.add( new XFSDeviceCode( context.getString( R.string.devices_sensors_values_of), ""));
		deviceCodes.add( new XFSDeviceCode( "[HANDSETSENSOR]"			, ""));
		deviceCodes.add( new XFSDeviceCode( "[ENHANCEDAUDIO]"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUCAPS.fwSensors"		, ""));
		deviceCodes.add( new XFSDeviceCode( "\tMANUAL"					, "0x01"));
		deviceCodes.add( new XFSDeviceCode( "\tAUTO"					, "0x02"));
		deviceCodes.add( new XFSDeviceCode( "\tSEMI_AUTO"				, "0x04"));
		
		deviceCodes.add( new XFSDeviceCode( "", ""));
		deviceCodes.add( new XFSDeviceCode( context.getString( R.string.devices_sensors_values_of) + " [HANDSETSENSOR]"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUCAPS.fwSensors"				, ""));
		deviceCodes.add( new XFSDeviceCode( "\tMICROPHONE"						, "0x10"));
		
		deviceCodes.add( new XFSDeviceCode( "", ""));
		deviceCodes.add( new XFSDeviceCode( context.getString( R.string.devices_sensors_values_of) + " [ENHANCEDAUDIO]"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUCAPS.fwSensors"				, ""));
		deviceCodes.add( new XFSDeviceCode( "\tBIDIRECTIONAL"					, "0x20"));
		
		deviceCodes.add( new XFSDeviceCode( "", ""));
		deviceCodes.add( new XFSDeviceCode( context.getString( R.string.devices_sensors_values_of) + " [AMBLIGHT]"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwSensors"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUCAPS.fwSensors"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTEVENT.wPortStatus"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTERROR.wPortStatus"	, ""));
		deviceCodes.add( new XFSDeviceCode( "\tVERY_DARK"					, "0x01"));
		deviceCodes.add( new XFSDeviceCode( "\tDARK"						, "0x02"));
		deviceCodes.add( new XFSDeviceCode( "\tMEDIUM_LIGHT"				, "0x04"));
		deviceCodes.add( new XFSDeviceCode( "\tLIGHT"						, "0x08"));
		deviceCodes.add( new XFSDeviceCode( "\tVERY_LIGHT"					, "0x10"));
		
		deviceCodes.add( new XFSDeviceCode( "", ""));
		deviceCodes.add( new XFSDeviceCode( context.getString( R.string.devices_sensors_values_of) + " [UPS]"				, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.fwAuxiliaries"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUCAPS.fwAuxiliaries"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTEVENT.wPortStatus"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUPORTERROR.wPortStatus"	, ""));
		deviceCodes.add( new XFSDeviceCode( "\tLOW"							, "0x02"));
		deviceCodes.add( new XFSDeviceCode( "\tENGAGED"						, "0x04"));
		deviceCodes.add( new XFSDeviceCode( "\tPOWERING"					, "0x08"));
		deviceCodes.add( new XFSDeviceCode( "\tRECOVERED"					, "0x10"));
		
		deviceCodes.add( new XFSDeviceCode( "", ""));
		deviceCodes.add( new XFSDeviceCode( context.getString( R.string.devices_sensors_values_of) + " WFSSIUCAPS.fwType"	, ""));
		deviceCodes.add( new XFSDeviceCode( "\tSENSORS"						, "0x01"));
		deviceCodes.add( new XFSDeviceCode( "\tDOORS"						, "0x02"));
		deviceCodes.add( new XFSDeviceCode( "\tINDICATORS"					, "0x04"));
		deviceCodes.add( new XFSDeviceCode( "\tAUXILIARIES"					, "0x08"));
		deviceCodes.add( new XFSDeviceCode( "\tGUIDLIGHTS"					, "0x10"));
		
		deviceCodes.add( new XFSDeviceCode( "", ""));
		deviceCodes.add( new XFSDeviceCode( context.getString( R.string.devices_sensors_values_of), ""));
		deviceCodes.add( new XFSDeviceCode( "[ENHANCEDAUDIOCONTROL]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "[ENHANCEDMICROPHONECONTROL]"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUCAPS.fwAuxiliaries"		, ""));
		deviceCodes.add( new XFSDeviceCode( "\tHEADSET_DETECTION"			, "0x01"));
		deviceCodes.add( new XFSDeviceCode( "\tMODE_CONTROLLABLE"			, "0x02"));
		
		deviceCodes.add( new XFSDeviceCode( "", ""));
		deviceCodes.add( new XFSDeviceCode( context.getString( R.string.devices_sensors_values_of), ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUENABLE.fwSensors"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUENABLE.fwDoors"			, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUENABLE.fwIndicators"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUENABLE.fwAuxiliaries"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUENABLE.fwGuidLights"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETPORTS.fwDoors"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETPORTS.fwIndicators"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETPORTS.fwAuxiliaries"	, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETPORTS.fwGuidLights"	, ""));
		deviceCodes.add( new XFSDeviceCode( "\tNO_CHANGE"					, "0x00"));
		deviceCodes.add( new XFSDeviceCode( "\tENABLE_EVENT"				, "0x01"));
		deviceCodes.add( new XFSDeviceCode( "\tDISABLE_EVENT"				, "0x02"));
		
		deviceCodes.add( new XFSDeviceCode( "", ""));
		deviceCodes.add( new XFSDeviceCode( context.getString( R.string.devices_sensors_values_of), ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETPORTS.fwDoors"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETDOOR.fwCommand"		, ""));
		deviceCodes.add( new XFSDeviceCode( "\tBOLT"						, "0x01"));
		deviceCodes.add( new XFSDeviceCode( "\tUNBOLT"						, "0x02"));
		
		deviceCodes.add( new XFSDeviceCode( "", ""));
		deviceCodes.add( new XFSDeviceCode( context.getString( R.string.devices_sensors_values_of)	, ""));
		deviceCodes.add( new XFSDeviceCode( "[UPS]"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETPORTS.fwAuxiliaries"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETAUXILIARY.wAuxiliary"		, ""));
		deviceCodes.add( new XFSDeviceCode( "\tENGAGE"							, "0x01"));
		deviceCodes.add( new XFSDeviceCode( "\tDISENGAGE"						, "0x02"));
		
		deviceCodes.add( new XFSDeviceCode( "", ""));
		deviceCodes.add( new XFSDeviceCode( context.getString( R.string.devices_sensors_values_of), ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUCAPS.fwAutoStartupMode"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSETSTARTUPTIME.wMode"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUGETSTARTUPTIME.wMode"		, ""));
		deviceCodes.add( new XFSDeviceCode( "\tAUTOSTARTUP_CLEAR"				, "0x01"));
		deviceCodes.add( new XFSDeviceCode( "\tAUTOSTARTUP_SPECIFIC"			, "0x02"));
		deviceCodes.add( new XFSDeviceCode( "\tAUTOSTARTUP_DAILY"				, "0x04"));
		deviceCodes.add( new XFSDeviceCode( "\tAUTOSTARTUP_WEEKLY"				, "0x08"));
		
		deviceCodes.add( new XFSDeviceCode( "", ""));
		deviceCodes.add( new XFSDeviceCode( context.getString( R.string.devices_sensors_values_of), ""));
		deviceCodes.add( new XFSDeviceCode( "WFSSIUSTATUS.wAntiFraudModule"		, ""));
		deviceCodes.add( new XFSDeviceCode( "\tAFMNOTSUPP"						, "0"));
		deviceCodes.add( new XFSDeviceCode( "\tAFMOK"							, "1"));
		deviceCodes.add( new XFSDeviceCode( "\tAFMDEVICEDETECTED"				, "3"));
		deviceCodes.add( new XFSDeviceCode( "\tAFMUNKNOWN"						, "4"));
		
		return deviceCodes;
	}
	
	public static ArrayList<XFSDeviceCode> getPinPadData() {

        ArrayList<XFSDeviceCode> deviceCodes = new ArrayList<XFSDeviceCode>();
		
		deviceCodes.add( new XFSDeviceCode( "WFSPINCAPS.wClass"			, ""));
        deviceCodes.add( new XFSDeviceCode( "WFS_SERVICE_CLASS_PIN"	, "4"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( "WFSPINSTATUS.fwDevice"			, ""));
        deviceCodes.add( new XFSDeviceCode( "\tDEVONLINE"			, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVOFFLINE"			, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVPOWEROFF"			, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVNODEVICE"			, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVHWERROR"			, "4"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVUSERERROR"		, "5"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVBUSY"				, "6"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVFRAUDATTEMPT"		, "7"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVPOTENTIALFRAUD"	, "8"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( "WFSPINSTATUS.fwEncStat", ""));
        deviceCodes.add( new XFSDeviceCode( "\tENCREADY"			, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tENCNOTREADY"			, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tENCNOTINITIALIZED"	, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tENCBUSY"				, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tENCUNDEFINED"		, "4"));
        deviceCodes.add( new XFSDeviceCode( "\tENCINITIALIZED"		, "5"));
        deviceCodes.add( new XFSDeviceCode( "\tENCPINTAMPERED"		, "6"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( "WFSPINSTATUS.fwAutoBeepMode"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFS_CMD_PIN_KEYPRESS_BEEP lpwMode"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tBEEP_ON_ACTIVE"					, "0x01"));
        deviceCodes.add( new XFSDeviceCode( "\tBEEP_ON_INACTIVE"				, "0x02"));
        
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( "WFSPINSTATUS.wDevicePosition"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSPINDEVICEPOSITION.wPosition"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tDEVICEINPOSITION"				, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVICENOTINPOSITION"				, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVICEPOSUNKNOWN"				, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVICEPOSNOTSUPP"				, "3"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( "WFSPINCAPS.fwType"		, ""));
        deviceCodes.add( new XFSDeviceCode( "\tTYPEEPP"				, "0x01"));
        deviceCodes.add( new XFSDeviceCode( "\tTYPEEDM"				, "0x02"));
        deviceCodes.add( new XFSDeviceCode( "\tTYPEHSM"				, "0x04"));
        deviceCodes.add( new XFSDeviceCode( "\tTYPEETS"				, "0x08"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( "WFSPINCAPS.fwAlgorithms"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSPINCRYPT.wAlgorithm"		, ""));
        deviceCodes.add( new XFSDeviceCode( "\tCRYPTDESECB"					, "0x0001"));
        deviceCodes.add( new XFSDeviceCode( "\tCRYPTDESCBC"					, "0x0002"));
        deviceCodes.add( new XFSDeviceCode( "\tCRYPTDESCFB"					, "0x0004"));
        deviceCodes.add( new XFSDeviceCode( "\tCRYPTRSA"					, "0x0008"));
		deviceCodes.add( new XFSDeviceCode( "\tCRYPTECMA"					, "0x0010"));
		deviceCodes.add( new XFSDeviceCode( "\tCRYPTDESMAC"					, "0x0020"));
		deviceCodes.add( new XFSDeviceCode( "\tCRYPTTRIDESECB"				, "0x0040"));
		deviceCodes.add( new XFSDeviceCode( "\tCRYPTTRIDESCBC"				, "0x0080"));
		deviceCodes.add( new XFSDeviceCode( "\tCRYPTTRIDESCFB"				, "0x0100"));
		deviceCodes.add( new XFSDeviceCode( "\tCRYPTTRIDESMAC"				, "0x0200"));
		deviceCodes.add( new XFSDeviceCode( "\tCRYPTMAAMAC"					, "0x0400"));
		deviceCodes.add( new XFSDeviceCode( "\tCRYPTTRIDESMAC2805"			, "0x0800"));
		deviceCodes.add( new XFSDeviceCode( "\tCRYPTSM4"					, "0x1000"));
		deviceCodes.add( new XFSDeviceCode( "\tCRYPTSM4MAC"					, "0x2000"));
		
        deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( "WFSPINCAPS.fwPinFormats"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tFORM3624"				, "0x0001"));
        deviceCodes.add( new XFSDeviceCode( "\tFORMANSI"				, "0x0002"));
        deviceCodes.add( new XFSDeviceCode( "\tFORMISO0"				, "0x0004"));
        deviceCodes.add( new XFSDeviceCode( "\tFORMISO1"				, "0x0008"));
		deviceCodes.add( new XFSDeviceCode( "\tFORMECI2"				, "0x0010"));
		deviceCodes.add( new XFSDeviceCode( "\tFORMECI3"				, "0x0020"));
		deviceCodes.add( new XFSDeviceCode( "\tFORMVISA"				, "0x0040"));
		deviceCodes.add( new XFSDeviceCode( "\tFORMDIEBOLD"				, "0x0080"));
		deviceCodes.add( new XFSDeviceCode( "\tFORMDIEBOLDCO"			, "0x0100"));
		deviceCodes.add( new XFSDeviceCode( "\tFORMVISA3"				, "0x0200"));
		deviceCodes.add( new XFSDeviceCode( "\tFORMBANKSYS"				, "0x0400"));
		deviceCodes.add( new XFSDeviceCode( "\tFORMEMV"					, "0x1000"));
		deviceCodes.add( new XFSDeviceCode( "\tFORMISO3"				, "0x2000"));
		deviceCodes.add( new XFSDeviceCode( "\tFORMAP"					, "0x4000"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( "WFSPINCAPS.fwDerivationAlgorithms"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tCHIP_ZKA"						, "0x01"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( "WFSPINCAPS.fwPresentationAlgorithms"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tPRESENT_CLEAR"						, "0x01"));
		
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( "WFSPINCAPS.fwDisplay"		, ""));
        deviceCodes.add( new XFSDeviceCode( "\tDISPNONE"				, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tDISPLEDTHROUGH"			, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tDISPDISPLAY"				, "3"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( "WFSPINCAPS.fwIDKey"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tIDKEYINITIALIZATION"	, "0x01"));
		deviceCodes.add( new XFSDeviceCode( "\tIDKEYIMPORT"			, "0x02"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( "WFSPINCAPS.fwValidationAlgorithms"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tDES"								, "0x01"));
        deviceCodes.add( new XFSDeviceCode( "\tEUROCHEQUE"						, "0x02"));
        deviceCodes.add( new XFSDeviceCode( "\tVISA"							, "0x04"));
        deviceCodes.add( new XFSDeviceCode( "\tDES_OFFSET "						, "0x08"));
		deviceCodes.add( new XFSDeviceCode( "\tBANKSYS"							, "0x10"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( "WFSPINCAPS.fwKeyCheckModes"		, ""));
		deviceCodes.add( new XFSDeviceCode( "WFSPINIMPORTKEYEX.wKeyCheckMode"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tKCVNONE"							, "0x00"));
        deviceCodes.add( new XFSDeviceCode( "\tKCVSELF"							, "0x01"));
        deviceCodes.add( new XFSDeviceCode( "\tKCVZERO"							, "0x02"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( "WFSPINCAPS.fwAutoBeep"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tBEEP_ACTIVE_AVAILABLE"			, "0x01"));
        deviceCodes.add( new XFSDeviceCode( "\tBEEP_ACTIVE_SELECTABLE"			, "0x02"));
        deviceCodes.add( new XFSDeviceCode( "\tBEEP_INACTIVE_AVAILABLE"			, "0x04"));
        deviceCodes.add( new XFSDeviceCode( "\tBEEP_INACTIVE_SELECTABLE "		, "0x08"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( "WFSPINCAPS.fwKeyBlockImportFormats", ""));
        deviceCodes.add( new XFSDeviceCode( "\tANSTR31KEYBLOCK"				, "0x01"));
        deviceCodes.add( new XFSDeviceCode( "\tANSTR31KEYBLOCKB"			, "0x02"));
        deviceCodes.add( new XFSDeviceCode( "\tANSTR31KEYBLOCKC "			, "0x04"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( "WFSPINKEYDETAIL.fwUse", ""));
		deviceCodes.add( new XFSDeviceCode( "WFSPINKEYDETAILEX.dwUse", ""));
        deviceCodes.add( new XFSDeviceCode( "\tUSECRYPT"				, "0x001"));
        deviceCodes.add( new XFSDeviceCode( "\tUSEFUNCTION"				, "0x002"));
        deviceCodes.add( new XFSDeviceCode( "\tUSEMACING"				, "0x004"));
		deviceCodes.add( new XFSDeviceCode( "\tUSEKEYENCKEY"			, "0x020"));
		deviceCodes.add( new XFSDeviceCode( "\tUSENODUPLICATE"			, "0x040"));
		deviceCodes.add( new XFSDeviceCode( "\tUSESVENCKEY"				, "0x080"));
		deviceCodes.add( new XFSDeviceCode( "\tUSECONSTRUCT"			, "0x100"));
		deviceCodes.add( new XFSDeviceCode( "\tUSESECURECONSTRUCT"		, "0x200"));
		deviceCodes.add( new XFSDeviceCode( "\tUSEANSTR31MASTER"		, "0x400"));
		deviceCodes.add( new XFSDeviceCode( "\tUSERESTRICTEDKEYENCKEY"	, "0x800"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode( "WFSPINKEYDETAILEX.dwUse"	, ""));
        deviceCodes.add( new XFSDeviceCode( "\tUSEPINLOCAL"				, "0x00010000"));
        deviceCodes.add( new XFSDeviceCode( "\tUSERSAPUBLIC"			, "0x00020000"));
        deviceCodes.add( new XFSDeviceCode( "\tUSERSAPRIVATE"			, "0x00040000"));
		deviceCodes.add( new XFSDeviceCode( "\tUSECHIPINFO"				, "0x00100000"));
		deviceCodes.add( new XFSDeviceCode( "\tUSECHIPPIN"				, "0x00200000"));
		deviceCodes.add( new XFSDeviceCode( "\tUSECHIPPS"				, "0x00400000"));
		deviceCodes.add( new XFSDeviceCode( "\tUSECHIPMAC"				, "0x00800000"));
		deviceCodes.add( new XFSDeviceCode( "\tUSECHIPLT"				, "0x01000000"));
		deviceCodes.add( new XFSDeviceCode( "\tUSECHIPMACLZ"			, "0x02000000"));
		deviceCodes.add( new XFSDeviceCode( "\tUSECHIPMACAZ"			, "0x04000000"));
		deviceCodes.add( new XFSDeviceCode( "\tUSERSAPUBLICVERIFY"		, "0x08000000"));
		deviceCodes.add( new XFSDeviceCode( "\tUSERSAPRIVATESIGN"		, "0x10000000"));
		deviceCodes.add( new XFSDeviceCode( "\tUSEPINREMOTE"			, "0x20000000"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINFUNCKEYDETAIL.ulFuncMask"	, ""));
		deviceCodes.add( new XFSDeviceCode("\tUNUSED"		, "0x00000000"));
		deviceCodes.add( new XFSDeviceCode("\tFK_0"			, "0x00000001"));
		deviceCodes.add( new XFSDeviceCode("\tFK_1"			, "0x00000002"));
		deviceCodes.add( new XFSDeviceCode("\tFK_2"			, "0x00000004"));
		deviceCodes.add( new XFSDeviceCode("\tFK_3"			, "0x00000008"));
		deviceCodes.add( new XFSDeviceCode("\tFK_4"			, "0x00000010"));
		deviceCodes.add( new XFSDeviceCode("\tFK_5"			, "0x00000020"));
		deviceCodes.add( new XFSDeviceCode("\tFK_6"			, "0x00000040"));
		deviceCodes.add( new XFSDeviceCode("\tFK_7"			, "0x00000080"));
		deviceCodes.add( new XFSDeviceCode("\tFK_8"			, "0x00000100"));
		deviceCodes.add( new XFSDeviceCode("\tFK_9"			, "0x00000200"));
		deviceCodes.add( new XFSDeviceCode("\tFK_ENTER"		, "0x00000400"));
		deviceCodes.add( new XFSDeviceCode("\tFK_CANCEL"	, "0x00000800"));
		deviceCodes.add( new XFSDeviceCode("\tFK_CLEAR"		, "0x00001000"));
		deviceCodes.add( new XFSDeviceCode("\tFK_BACKSPACE"	, "0x00002000"));
		deviceCodes.add( new XFSDeviceCode("\tFK_HELP"		, "0x00004000"));
		deviceCodes.add( new XFSDeviceCode("\tFK_DECPOINT"	, "0x00008000"));
		deviceCodes.add( new XFSDeviceCode("\tFK_00"		, "0x00010000"));
		deviceCodes.add( new XFSDeviceCode("\tFK_000"		, "0x00020000"));
		deviceCodes.add( new XFSDeviceCode("\tFK_RES1"		, "0x00040000"));
		deviceCodes.add( new XFSDeviceCode("\tFK_RES2"		, "0x00080000"));
		deviceCodes.add( new XFSDeviceCode("\tFK_RES3"		, "0x00100000"));
		deviceCodes.add( new XFSDeviceCode("\tFK_RES4"		, "0x00200000"));
		deviceCodes.add( new XFSDeviceCode("\tFK_RES5"		, "0x00400000"));
		deviceCodes.add( new XFSDeviceCode("\tFK_RES6"		, "0x00800000"));
		deviceCodes.add( new XFSDeviceCode("\tFK_RES7"		, "0x01000000"));
		deviceCodes.add( new XFSDeviceCode("\tFK_RES8"		, "0x02000000"));
		deviceCodes.add( new XFSDeviceCode("\tFK_OEM1"		, "0x04000000"));
		deviceCodes.add( new XFSDeviceCode("\tFK_OEM2"		, "0x08000000"));
		deviceCodes.add( new XFSDeviceCode("\tFK_OEM3"		, "0x10000000"));
		deviceCodes.add( new XFSDeviceCode("\tFK_OEM4"		, "0x20000000"));
		deviceCodes.add( new XFSDeviceCode("\tFK_OEM5"		, "0x40000000"));
		deviceCodes.add( new XFSDeviceCode("\tFK_OEM6"		, "0x80000000"));

		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINFDK.ulFDK"	, ""));
		deviceCodes.add( new XFSDeviceCode("\tFDK01"		, "0x00000001"));
		deviceCodes.add( new XFSDeviceCode("\tFDK02"		, "0x00000002"));
		deviceCodes.add( new XFSDeviceCode("\tFDK03"		, "0x00000004"));
		deviceCodes.add( new XFSDeviceCode("\tFDK04"		, "0x00000008"));
		deviceCodes.add( new XFSDeviceCode("\tFDK05"		, "0x00000010"));
		deviceCodes.add( new XFSDeviceCode("\tFDK06"		, "0x00000020"));
		deviceCodes.add( new XFSDeviceCode("\tFDK07"		, "0x00000040"));
		deviceCodes.add( new XFSDeviceCode("\tFDK08"		, "0x00000080"));
		deviceCodes.add( new XFSDeviceCode("\tFDK09"		, "0x00000100"));
		deviceCodes.add( new XFSDeviceCode("\tFDK10"		, "0x00000200"));
		deviceCodes.add( new XFSDeviceCode("\tFDK11"		, "0x00000400"));
		deviceCodes.add( new XFSDeviceCode("\tFDK12"		, "0x00000800"));
		deviceCodes.add( new XFSDeviceCode("\tFDK13"		, "0x00001000"));
		deviceCodes.add( new XFSDeviceCode("\tFDK14"		, "0x00002000"));
		deviceCodes.add( new XFSDeviceCode("\tFDK15"		, "0x00004000"));
		deviceCodes.add( new XFSDeviceCode("\tFDK16"		, "0x00008000"));
		deviceCodes.add( new XFSDeviceCode("\tFDK17"		, "0x00010000"));
		deviceCodes.add( new XFSDeviceCode("\tFDK18"		, "0x00020000"));
		deviceCodes.add( new XFSDeviceCode("\tFDK19"		, "0x00040000"));
		deviceCodes.add( new XFSDeviceCode("\tFDK20"		, "0x00080000"));
		deviceCodes.add( new XFSDeviceCode("\tFDK21"		, "0x00100000"));
		deviceCodes.add( new XFSDeviceCode("\tFDK22"		, "0x00200000"));
		deviceCodes.add( new XFSDeviceCode("\tFDK23"		, "0x00400000"));
		deviceCodes.add( new XFSDeviceCode("\tFDK24"		, "0x00800000"));
		deviceCodes.add( new XFSDeviceCode("\tFDK25"		, "0x01000000"));
		deviceCodes.add( new XFSDeviceCode("\tFDK26"		, "0x02000000"));
		deviceCodes.add( new XFSDeviceCode("\tFDK27"		, "0x04000000"));
		deviceCodes.add( new XFSDeviceCode("\tFDK28"		, "0x08000000"));
		deviceCodes.add( new XFSDeviceCode("\tFDK29"		, "0x10000000"));
		deviceCodes.add( new XFSDeviceCode("\tFDK30"		, "0x20000000"));
		deviceCodes.add( new XFSDeviceCode("\tFDK31"		, "0x40000000"));
		deviceCodes.add( new XFSDeviceCode("\tFDK32"		, "0x80000000"));

		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINCRYPT.wMode"	, ""));
		deviceCodes.add( new XFSDeviceCode("\tMODEENCRYPT"		, "1"));
		deviceCodes.add( new XFSDeviceCode("\tMODEDECRYPT"		, "2"));
		deviceCodes.add( new XFSDeviceCode("\tMODERANDOM"		, "3"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINENTRY.wCompletion"	, ""));
		deviceCodes.add( new XFSDeviceCode("\tCOMPAUTO"					, "0"));
		deviceCodes.add( new XFSDeviceCode("\tCOMPENTER"				, "1"));
		deviceCodes.add( new XFSDeviceCode("\tCOMPCANCEL"				, "2"));
		deviceCodes.add( new XFSDeviceCode("\tCOMPCONTINUE"				, "6"));
		deviceCodes.add( new XFSDeviceCode("\tCOMPCLEAR"				, "7"));
		deviceCodes.add( new XFSDeviceCode("\tCOMPBACKSPACE"			, "8"));
		deviceCodes.add( new XFSDeviceCode("\tCOMPFDK"					, "9"));
		deviceCodes.add( new XFSDeviceCode("\tCOMPHELP"					, "10"));
		deviceCodes.add( new XFSDeviceCode("\tCOMPFK"					, "11"));
		deviceCodes.add( new XFSDeviceCode("\tCOMPCONTFDK"				, "12"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINSECMSG.wProtocol"	, ""));
		deviceCodes.add( new XFSDeviceCode("\tPROTISOAS"    			, "1"));
		deviceCodes.add( new XFSDeviceCode("\tPROTISOLZ"    			, "2"));
		deviceCodes.add( new XFSDeviceCode("\tPROTISOPS"    			, "3"));
		deviceCodes.add( new XFSDeviceCode("\tPROTCHIPZKA"  			, "4"));
		deviceCodes.add( new XFSDeviceCode("\tPROTRAWDATA"  			, "5"));
		deviceCodes.add( new XFSDeviceCode("\tPROTPBM"      			, "6"));
		deviceCodes.add( new XFSDeviceCode("\tPROTHSMLDI"   			, "7"));
		deviceCodes.add( new XFSDeviceCode("\tPROTGENAS"				, "8"));
		deviceCodes.add( new XFSDeviceCode("\tPROTCHIPINCHG"			, "9"));
		deviceCodes.add( new XFSDeviceCode("\tPROTPINCMP"				, "10"));
		deviceCodes.add( new XFSDeviceCode("\tPROTISOPINCHG"			, "11"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINHSMINIT.wInitMode"	, ""));
		deviceCodes.add( new XFSDeviceCode("\tINITTEMP"    				, "1"));
		deviceCodes.add( new XFSDeviceCode("\tINITDEFINITE"    			, "2"));
		deviceCodes.add( new XFSDeviceCode("\tINITIRREVERSIBLE"    		, "3"));
		      
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINENCIO.wProtocol"			, ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINCAPS.fwENCIOProtocols"	, ""));
		deviceCodes.add( new XFSDeviceCode("\tENC_PROT_CH"     			, "0x01"));
		deviceCodes.add( new XFSDeviceCode("\tENC_PROT_GIECB"  			, "0x02"));
		deviceCodes.add( new XFSDeviceCode("\tENC_PROT_LUX"    			, "0x04"));
		deviceCodes.add( new XFSDeviceCode("\tENC_PROT_CHN"    			, "0x08"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFS_SRVE_PIN_CERTIFICATE_CHANGE"	, ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINSTATUS.dwCertificateState"	, ""));
		deviceCodes.add( new XFSDeviceCode("\tCERT_SECONDARY"     				, "0x02"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINSTATUS.dwCertificateState", ""));
		deviceCodes.add( new XFSDeviceCode("\tRSA_AUTH_2PARTY_SIG"     				, "0x00"));
		deviceCodes.add( new XFSDeviceCode("\tRSA_AUTH_3PARTY_CERT"  				, "0x01"));
		deviceCodes.add( new XFSDeviceCode("\tRSA_AUTH_3PARTY_CERT_TR34"    		, "0x04"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINCAPS.dwRestrictedKeyEncKeySupport"	, ""));
		deviceCodes.add( new XFSDeviceCode("\tRESTRICTED_SECUREKEYENTRY"     			, "0x10000"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINCAPS.dwSignatureScheme"	, ""));
		deviceCodes.add( new XFSDeviceCode("\tSIG_GEN_RSA_KEY_PAIR"     	, "0x01"));
		deviceCodes.add( new XFSDeviceCode("\tSIG_RANDOM_NUMBER"  			, "0x02"));
		deviceCodes.add( new XFSDeviceCode("\tSIG_EXPORT_EPP_ID"    		, "0x04"));
		deviceCodes.add( new XFSDeviceCode("\tSIG_ENHANCED_RKL"    			, "0x08"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINIMPORTRSAPUBLICKEY.dwRSASignatureAlgorithm"	, ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINCAPS.dwRSASignatureAlgorithm"					, ""));
		deviceCodes.add( new XFSDeviceCode("\tSIGN_NA"     										, "0x00"));
		deviceCodes.add( new XFSDeviceCode("\tSIGN_RSASSA_PKCS1_V1_5"  							, "0x01"));
		deviceCodes.add( new XFSDeviceCode("\tSIGN_RSASSA_PSS"    								, "0x02"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINIMPORTRSAPUBLICKEYOUTPUT.dwRSAKeyCheckMode"	, ""));
		deviceCodes.add( new XFSDeviceCode("\tRSA_KCV_NONE"     								, "0x00"));
		deviceCodes.add( new XFSDeviceCode("\tRSA_KCV_SHA1"  									, "0x01"));
		deviceCodes.add( new XFSDeviceCode("\tRSA_KCV_SHA256"    								, "0x02"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINEXPORTRSAISSUERSIGNEDITEM.wExportItemType"	, ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINEXPORTRSAEPPSIGNEDITEM.wExportItemType"		, ""));
		deviceCodes.add( new XFSDeviceCode("\tEXPORT_EPP_ID"     								, "0x01"));
		deviceCodes.add( new XFSDeviceCode("\tEXPORT_PUBLIC_KEY"  								, "0x02"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINIMPORTRSASIGNEDDESKEY.dwRSAEncipherAlgorithm"	, ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINCAPS.dwRSACryptAlgorithm"		, ""));
		deviceCodes.add( new XFSDeviceCode("\tCRYPT_RSAES_PKCS1_V1_5"     		, "0x01"));
		deviceCodes.add( new XFSDeviceCode("\tCRYPT_RSAES_OAEP"  				, "0x02"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINGENERATERSAKEYPAIR.wExponentValue"	, ""));
		deviceCodes.add( new XFSDeviceCode("\tDEFAULT"     								, "0"));
		deviceCodes.add( new XFSDeviceCode("\tEXPONENT_1"  								, "1"));
		deviceCodes.add( new XFSDeviceCode("\tEXPONENT_4"    							, "2"));
		deviceCodes.add( new XFSDeviceCode("\tEXPONENT_16"    							, "3"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINCAPS.wDESKeyLength"						, ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINIMPORTRSASIGNEDDESKEYOUTPUT.wKeyLength"	, ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINIMPORTRSAENCIPHEREDPKCS7KEYOUTPUT"		, ""));
		deviceCodes.add( new XFSDeviceCode("\tKEYSINGLE"     		, "0x01"));
		deviceCodes.add( new XFSDeviceCode("\tKEYDOUBLE"  			, "0x02"));
		deviceCodes.add( new XFSDeviceCode("\tKEYTRIPLE"  			, "0x04"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINGETCERTIFICATE.wGetCertificate"	, ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINCAPS.wCertificateTypes"			, ""));
		deviceCodes.add( new XFSDeviceCode("\tPUBLICENCKEY"     					, "0x01"));
		deviceCodes.add( new XFSDeviceCode("\tPUBLICVERIFICATIONKEY"  				, "0x02"));
		deviceCodes.add( new XFSDeviceCode("\tPUBLICHOSTKEY"  						, "0x04"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINAUTHENTICATE.dwSigner"		, ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINLOADCERTIFICATEEX.dwSigner"	, ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINSIGNERCAP.dwSigner"			, ""));
		deviceCodes.add( new XFSDeviceCode("\tSIGNER_NONE"     					, "0x01"));
		deviceCodes.add( new XFSDeviceCode("\tSIGNER_CERTHOST"  				, "0x02"));
		deviceCodes.add( new XFSDeviceCode("\tSIGNER_SIGHOST"  					, "0x04"));
		deviceCodes.add( new XFSDeviceCode("\tSIGNER_CA"     					, "0x08"));
		deviceCodes.add( new XFSDeviceCode("\tSIGNER_HL"  						, "0x10"));
		deviceCodes.add( new XFSDeviceCode("\tSIGNER_CBCMAC"  					, "0x20"));
		deviceCodes.add( new XFSDeviceCode("\tSIGNER_CMAC"     					, "0x40"));
		deviceCodes.add( new XFSDeviceCode("\tSIGNER_TR34"  					, "0x10000000"));
		deviceCodes.add( new XFSDeviceCode("\tSIGNER_RESERVED_1"  				, "0x20000000"));
		deviceCodes.add( new XFSDeviceCode("\tSIGNER_RESERVED_2"     			, "0x40000000"));
		deviceCodes.add( new XFSDeviceCode("\tSIGNER_RESERVED_3"  				, "0x80000000"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINLOADCERTIFICATEEX.dwLoadOption"	, ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINSIGNERCAP.dwOption"				, ""));
		deviceCodes.add( new XFSDeviceCode("\tLOAD_NEWHOST"     					, "0x01"));
		deviceCodes.add( new XFSDeviceCode("\tLOAD_REPLACEHOST"  					, "0x02"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINIMPORTRSAENCIPHEREDPKCS7EX.dwCRKLLoadOption"	, ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINCAPS.wCertificateTypes"			, ""));
		deviceCodes.add( new XFSDeviceCode("\tCRKLLOAD_NORANDOM"    				, "0x01"));
		deviceCodes.add( new XFSDeviceCode("\tCRKLLOAD_NORANDOM_CRL"  				, "0x02"));
		deviceCodes.add( new XFSDeviceCode("\tCRKLLOAD_RANDOM"      				, "0x04"));
		deviceCodes.add( new XFSDeviceCode("\tCRKLLOAD_RANDOM_CRL"  				, "0x08"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINEMVIMPORTPUBLICKEY.wImportScheme"	, ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINCAPS.lpwEMVImportSchemes"			, ""));
		deviceCodes.add( new XFSDeviceCode("\tEMV_IMPORT_PLAIN_CA"   				, "1"));
		deviceCodes.add( new XFSDeviceCode("\tEMV_IMPORT_CHKSUM_CA"    				, "2"));
		deviceCodes.add( new XFSDeviceCode("\tEMV_IMPORT_EPI_CA"     				, "3"));
		deviceCodes.add( new XFSDeviceCode("\tEMV_IMPORT_ISSUER"     				, "4"));
		deviceCodes.add( new XFSDeviceCode("\tEMV_IMPORT_ICC"        				, "5"));
		deviceCodes.add( new XFSDeviceCode("\tEMV_IMPORT_ICC_PIN"    				, "6"));
		deviceCodes.add( new XFSDeviceCode("\tEMV_IMPORT_PKCSV1_5_CA"				, "7"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINDIGEST.wHashAlgorithm"		, ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINCAPS.fwEMVHashAlgorithm"		, ""));
		deviceCodes.add( new XFSDeviceCode("\tHASH_SHA1_DIGEST"    				, "0x01"));
		deviceCodes.add( new XFSDeviceCode("\tHASH_SHA256_DIGEST"  				, "0x02"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINSECUREKEYDETAIL.fwKeyEntryMode"	, ""));
		deviceCodes.add( new XFSDeviceCode("\tSECUREKEY_NOTSUPP"     				, "0x00"));
		deviceCodes.add( new XFSDeviceCode("\tSECUREKEY_REG_SHIFT"   				, "0x01"));
		deviceCodes.add( new XFSDeviceCode("\tSECUREKEY_REG_UNIQUE"    				, "0x02"));
		deviceCodes.add( new XFSDeviceCode("\tSECUREKEY_IRREG_SHIFT" 				, "0x04"));
		deviceCodes.add( new XFSDeviceCode("\tSECUREKEY_IRREG_UNIQUE"				, "0x08"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINSTATUS.wAntiFraudModule"	, ""));
		deviceCodes.add( new XFSDeviceCode("\tAFMNOTSUPP"         				, "0"));
		deviceCodes.add( new XFSDeviceCode("\tAFMOK"               				, "1"));
		deviceCodes.add( new XFSDeviceCode("\tAFMINOP"            				, "2"));
		deviceCodes.add( new XFSDeviceCode("\tAFMDEVICEDETECTED"  				, "3"));
		deviceCodes.add( new XFSDeviceCode("\tAFMUNKNOWN"         				, "4"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINLAYOT.dwEntryMode"	, ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINGETLAYOUT.dwEntryMode"	, ""));
		deviceCodes.add( new XFSDeviceCode("\tLAYOUT_DATA"    				, "0x01"));
		deviceCodes.add( new XFSDeviceCode("\tLAYOUT_PIN"  					, "0x02"));
		deviceCodes.add( new XFSDeviceCode("\tLAYOUT_SECURE"      			, "0x04"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
		deviceCodes.add( new XFSDeviceCode("WFSPINFK.wKeyType"			, ""));
		deviceCodes.add( new XFSDeviceCode("\tFK"    					, "0x01"));
		deviceCodes.add( new XFSDeviceCode("\tFDK"  					, "0x02"));
		
		return deviceCodes;
	}
	
	public static ArrayList<XFSDeviceCode> getManagerData( Context context) {

        ArrayList<XFSDeviceCode> deviceCodes = new ArrayList<XFSDeviceCode>();

        deviceCodes.add( new XFSDeviceCode( "WFSDEVSTATUS.fwState"			, ""));
        deviceCodes.add( new XFSDeviceCode( "\tDEVONLINE"			, "0"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVOFFLINE"			, "1"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVPOWEROFF"			, "2"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVNODEVICE"			, "3"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVHWERROR"			, "4"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVUSERERROR"		, "5"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVBUSY"				, "6"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVFRAUDATTEMPT"		, "7"));
        deviceCodes.add( new XFSDeviceCode( "\tDEVPOTENTIALFRAUD"	, "8"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( "WFS_DEFAULT_HAPP"	, "0"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( context.getString(R.string.devices_manager_messages), ""));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_OPEN_COMPLETE"			, "0x401"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_CLOSE_COMPLETE"			, "0x402"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_LOCK_COMPLETE"			, "0x403"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_UNLOCK_COMPLETE"			, "0x404"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_REGISTER_COMPLETE"		, "0x405"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_DEREGISTER_COMPLETE"		, "0x406"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_GETINFO_COMPLETE"		, "0x407"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_EXECUTE_COMPLETE"		, "0x408"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_EXECUTE_EVENT"			, "0x414"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_SERVICE_EVENT"			, "0x415"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_USER_EVENT"				, "0x416"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_SYSTEM_EVENT"			, "0x417"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_TIMER_EVENT"				, "0x464"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( context.getString(R.string.devices_manager_event_classes), ""));
		deviceCodes.add( new XFSDeviceCode( "\tSERVICE_EVENTS"			, "1"));
		deviceCodes.add( new XFSDeviceCode( "\tUSER_EVENTS"				, "2"));
		deviceCodes.add( new XFSDeviceCode( "\tSYSTEM_EVENTS"			, "4"));
		deviceCodes.add( new XFSDeviceCode( "\tEXECUTE_EVENTS"			, "8"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( context.getString(R.string.devices_manager_trace_level)	, ""));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_TRACE_API"				, "0x01"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_TRACE_ALL_API"			, "0x02"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_TRACE_SPI"				, "0x04"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_TRACE_ALL_SPI"			, "0x08"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_TRACE_MGR"				, "0x10"));
		
		deviceCodes.add( new XFSDeviceCode("", ""));
        deviceCodes.add( new XFSDeviceCode( context.getString(R.string.devices_manager_error_actions)	, ""));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_ERR_ACT_NOACTION"		, "0x00"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_ERR_ACT_RESET"			, "0x01"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_ERR_ACT_SWERROR"			, "0x02"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_ERR_ACT_CONFIG"			, "0x04"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_ERR_ACT_HWCLEAR"			, "0x08"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_ERR_ACT_HWMAINT"			, "0x10"));
		deviceCodes.add( new XFSDeviceCode( "\tWFS_ERR_ACT_SUSPEND"			, "0x20"));
		
		return deviceCodes;
	}
}
