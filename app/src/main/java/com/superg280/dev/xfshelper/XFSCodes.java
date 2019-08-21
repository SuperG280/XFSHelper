package com.superg280.dev.xfshelper;

import java.util.ArrayList;

public class XFSCodes {


    public static XFSElement getXFSError( int nCode) {

        XFSElement element = new XFSElement();

        switch( nCode) {
            ///////////////////////////////////////////////////////
            //Errores genericos:
            case 0:
                element.setErrorCode( "WFS_SUCCESS");
                element.setDescription( "WFS_INDEFINITE_WAIT as a time\n" +
                                        "WFS_STAT_DEVONLINE as fwState\n" +
                                        "WFS_PTR_MEDIAPRESENT as fwMedia\n" +
                                        "WFS_CDM_DISPOK as fwDispenser\n" +
                                        "WFS_CDM_ISEMPTY as fwIntermediateStacker\n" +
                                        "WFS_CDM_STATCUOK as unit.usStatus");
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

    public static XFSElement getXFSCommandResult( int nCode, boolean bExecute) {

        XFSElement element = new XFSElement();

        switch( nCode) {

            ///////////////////////////////////////
            //Eventos de System
            case 1:
                element.setErrorCode("WFS_SYSE_UNDELIVERABLE_MSG");
                element.setDescription( "WFS_STAT_DEVOFFLINE as fwState\n" +
                                        "WFS_IDC_MEDIAPRESENT as fwMedia\n" +
                                        "WFS_IDC_RETAINBINOK as fwRetainBin\n" +
                                        "WFS_PTR_MEDIANOTPRESENT as fwMedia\n" +
                                        "WFS_CDM_DISPCUSTATE as fwDispenser\n" +
                                        "WFS_CDM_ISNOTEMPTY as fwIntermediateStacker\n" +
                                        "WFS_CDM_STATCUFULL as unit.usStatus\n" +
                                        "WFS_CDM_TYPENA as unit.usType");
                break;
            case 2:
                element.setErrorCode("WFS_SYSE_HARDWARE_ERROR");
                element.setDescription( "WFS_STAT_DEVPOWEROFF as fwState\n" +
                                        "WFS_IDC_MEDIANOTPRESENT as fwMedia\n" +
                                        "WFS_IDC_RETAINNOTSUPP as fwRetainBin\n" +
                                        "WFS_PTR_MEDIAJAMMED as fwMedia\n" +
                                        "WFS_CDM_DISPCUSTOP as fwDispenser\n" +
                                        "WFS_CDM_ISNOTEMPTYCUST as fwIntermediateStacker\n" +
                                        "WFS_CDM_STATCUHIGH as unit.usStatus\n" +
                                        "WFS_CDM_TYPEREJECTCASSETTE as unit.usType");
                break;
            case 3:
                element.setErrorCode("WFS_SYSE_VERSION_ERROR");
                element.setDescription( "WFS_STAT_DEVNODEVICE as fwState\n" +
                                        "WFS_IDC_MEDIAJAMMED as fwMedia\n" +
                                        "WFS_IDC_RETAINBINFULL as fwRetainBin\n" +
                                        "WFS_PTR_MEDIANOTSUPP as fwMedia\n" +
                                        "WFS_CDM_DISPCUUNKNOWN as fwDispenser\n" +
                                        "WFS_CDM_ISNOTEMPTYUNK as fwIntermediateStacker\n" +
                                        "WFS_CDM_STATCULOW as unit.usStatus\n" +
                                        "WFS_CDM_TYPEBILLCASSETTE as unit.usType");
                break;
            case 4:
                element.setErrorCode("WFS_SYSE_DEVICE_STATUS");
                element.setDescription( "WFS_STAT_DEVHWERROR as fwState\n" +
                                        "WFS_IDC_MEDIANOTSUPP as fwMedia\n" +
                                        "WFS_IDC_RETAINBINHIGH as fwRetainBin\n" +
                                        "WFS_PTR_MEDIAUNKNOWN as fwMedia\n" +
                                        "WFS_CDM_ISUNKNOWN as fwIntermediateStacker\n" +
                                        "WFS_CDM_STATCUEMPTY as unit.usStatus\n" +
                                        "WFS_CDM_TYPECOINCYLINDER as unit.usType");
                break;
            case 5:
                element.setErrorCode("WFS_SYSE_APP_DISCONNECT");
                element.setDescription( "WFS_STAT_DEVUSERERROR as fwState\n" +
                                        "WFS_IDC_MEDIAUNKNOWN as fwMedia\n" +
                                        "WFS_IDC_RETAINBINMISSING as fwRetainBin\n" +
                                        "WFS_PTR_MEDIAENTERING as fwMedia\n" +
                                        "WFS_CDM_ISNOTSUPPORTED as fwIntermediateStacker\n" +
                                        "WFS_CDM_STATCUINOP as unit.usStatus\n" +
                                        "WFS_CDM_TYPECOINDISPENSER as unit.usType");
                break;
            case 6:
                element.setErrorCode("WFS_SYSE_SOFTWARE_ERROR");
                element.setDescription( "WFS_STAT_DEVBUSY as fwState\n" +
                                        "WFS_IDC_MEDIAENTERING as fwMedia\n" +
                                        "WFS_PTR_MEDIARETRACTED as fwMedia\n" +
                                        "WFS_CDM_STATCUMISSING as unit.usStatus\n" +
                                        "WFS_CDM_TYPERETRACTCASSETTE as unit.usType");
                break;
            case 7:
                element.setErrorCode("WFS_SYSE_USER_ERROR");
                element.setDescription( "WFS_STAT_DEVFRAUDATTEMPT as fwState\n" +
                                        "WFS_IDC_MEDIALATCHED as fwMedia\n" +
                                        "WFS_PTR_MEDIAEXPELLED as fwMedia\n" +
                                        "WFS_CDM_STATCUNOVAL as unit.usStatus\n" +
                                        "WFS_CDM_TYPECOUPON as unit.usType");
                break;
            case 8:
                element.setErrorCode("WFS_SYSE_LOCK_REQUESTED");
                element.setDescription( "WFS_STAT_DEVPOTENTIALFRAUD as fwState\n" +
                                        "WFS_CDM_STATCUNOREF as unit.usStatus\n" +
                                        "WFS_CDM_TYPEDOCUMENT as unit.usType");
                break;
            case 9:
                element.setErrorCode("WFS_SYSE_FRAUD_ATTEMPT");
                element.setDescription( "WFS_CDM_STATCUMANIP as unit.usStatus\n" +
                                        "WFS_CDM_TYPEBILLCASSETTE as unit.usType");

            case 11:
                element.setErrorCode("");
                element.setDescription( "WFS_CDM_TYPEREPCONTAINER as unit.usType");

            case 12:
                element.setErrorCode("");
                element.setDescription( "WFS_CDM_TYPERECYCLING as unit.usType");
                break;

            ///////////////////////////////////////
            //Comandos y eventos de Impresora
            case 101:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_CONTROL_MEDIA" : "WFS_INF_PTR_STATUS");
                element.setDescription( "Evento: WFS_EXEE_PTR_NOMEDIA");
                break;
            case 102:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_PRINT_FORM" : "WFS_INF_PTR_CAPABILITIES");
                element.setDescription( "Evento: WFS_EXEE_PTR_MEDIAINSERTED");
                break;
            case 103:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_READ_FORM" : "WFS_INF_PTR_FORM_LIST");
                element.setDescription( "Evento: WFS_EXEE_PTR_FIELDERROR");
                break;
            case 104:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_RAW_DATA" : "WFS_INF_PTR_MEDIA_LIST");
                element.setDescription( "Evento: WFS_EXEE_PTR_FIELDWARNING");
                break;
            case 105:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_MEDIA_EXTENTS" : "WFS_INF_PTR_QUERY_FORM");
                element.setDescription( "Evento: WFS_USRE_PTR_RETRACTBINTHRESHOLD");
                break;
            case 106:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_RESET_COUNT" : "WFS_INF_PTR_QUERY_MEDIA");
                element.setDescription( "Evento: WFS_SRVE_PTR_MEDIATAKEN");
                break;
            case 107:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_READ_IMAGE" : "WFS_INF_PTR_QUERY_FIELD");
                element.setDescription( "Evento: WFS_USRE_PTR_PAPERTHRESHOLD");
                break;
            case 108:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_RESET" : "WFS_INF_PTR_CODELINE_MAPPING");
                element.setDescription( "Evento: WFS_USRE_PTR_TONERTHRESHOLD");
                break;
            case 109:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_RETRACT_MEDIA" : "");
                element.setDescription( "Evento: WFS_SRVE_PTR_MEDIAINSERTED");
                break;
            case 110:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_DISPENSE_PAPER" : "");
                element.setDescription( "Evento: WFS_SRVE_PTR_MEDIAINSERTED");
                break;
            case 111:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_SET_GUIDANCE_LIGHT" : "");
                element.setDescription( "Evento: WFS_USRE_PTR_INKTHRESHOLD");
                break;
            case 112:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_PRINT_RAW_FILE" : "");
                element.setDescription( "Evento: WFS_SRVE_PTR_MEDIADETECTED");
                break;
            case 113:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_LOAD_DEFINITION" : "");
                element.setDescription( "Evento: WFS_SRVE_PTR_RETRACTBINSTATUS");
                break;
            case 114:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_SUPPLY_REPLENISH" : "");
                element.setDescription( "Evento: WFS_EXEE_PTR_MEDIAPRESENTED");
                break;
            case 115:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_POWER_SAVE_CONTROL" : "");
                element.setDescription( "Evento: WFS_SRVE_PTR_DEFINITIONLOADED");
                break;
            case 116:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_CONTROL_PASSBOOK" : "");
                element.setDescription( "Evento: WFS_EXEE_PTR_MEDIAREJECTED");
                break;
            case 117:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_SET_BLACK_MARK_MODE" : "");
                element.setDescription( "Evento: WFS_SRVE_PTR_MEDIAPRESENTED");
                break;
            case 118:
                element.setErrorCode( bExecute ? "WFS_CMD_PTR_SYNCHRONIZE_COMMAND" : "");
                element.setDescription( "Evento: WFS_SRVE_PTR_MEDIAAUTORETRACTED");
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
                element.setDescription( "Evento: WFS_EXEE_IDC_INVALIDTRACKDATA");
                break;
            case 202:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_WRITE_TRACK" : "WFS_INF_IDC_CAPABILITIES");
                element.setDescription( "");
                break;
            case 203:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_EJECT_CARD" : "WFS_INF_IDC_FORM_LIST");
                element.setDescription( "Evento: WFS_EXEE_IDC_MEDIAINSERTED");
                break;
            case 204:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_RETAIN_CARD" : "WFS_INF_IDC_QUERY_FORM");
                element.setDescription( "Evento: WFS_SRVE_IDC_MEDIAREMOVED");
                break;
            case 205:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_RESET_COUNT" : "WFS_INF_IDC_QUERY_IFM_IDENTIFIER");
                element.setDescription( "Evento: WFS_SRVE_IDC_CARDACTION");
                break;
            case 206:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_SETKEY" : "WFS_INF_IDC_EMVCLESS_QUERY_APPS");
                element.setDescription( "Evento: WFS_USRE_IDC_RETAINBINTHRESHOLD");
                break;
            case 207:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_READ_RAW_DATA" : "");
                element.setDescription( "Evento: WFS_EXEE_IDC_INVALIDMEDIA");
                break;
            case 208:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_WRITE_RAW_DATA" : "");
                element.setDescription( "Evento: WFS_EXEE_IDC_MEDIARETAINED");
                break;
            case 209:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_CHIP_IO" : "");
                element.setDescription( "Evento: WFS_SRVE_IDC_MEDIADETECTED");
                break;
            case 210:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_RESET" : "");
                element.setDescription( "Evento: WFS_SRVE_IDC_RETAINBININSERTED");
                break;
            case 211:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_CHIP_POWER" : "");
                element.setDescription( "Evento: WFS_SRVE_IDC_RETAINBINREMOVED");
                break;
            case 212:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_PARSE_DATA" : "");
                element.setDescription( "Evento: WFS_EXEE_IDC_INSERTCARD");
                break;
            case 213:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_SET_GUIDANCE_LIGHT" : "");
                element.setDescription( "Evento: WFS_SRVE_IDC_DEVICEPOSITION");
                break;
            case 214:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_POWER_SAVE_CONTROL" : "");
                element.setDescription( "Evento: WFS_SRVE_IDC_POWER_SAVE_CHANGE");
                break;
            case 215:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_PARK_CARD" : "");
                element.setDescription( "Evento: WFS_EXEE_IDC_TRACKDETECTED");
                break;
            case 216:
                element.setErrorCode( bExecute ? "WFS_CMD_IDC_EMVCLESS_CONFIGURE" : "");
                element.setDescription( "Evento: WFS_EXEE_IDC_EMVCLESSREADSTATUS");
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
                element.setDescription( "Evento: WFS_SRVE_CDM_SAFEDOOROPEN");
                break;
            case 302:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_DISPENSE" : "WFS_INF_CDM_CAPABILITIES");
                element.setDescription( "Evento: WFS_SRVE_CDM_SAFEDOORCLOSED");
                break;
            case 303:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_PRESENT" : "WFS_INF_CDM_CASH_UNIT_INFO");
                element.setDescription( "Evento: WFS_USRE_CDM_CASHUNITTHRESHOLD");
                break;
            case 304:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_REJECT" : "WFS_INF_CDM_TELLER_INFO");
                element.setDescription( "Evento: WFS_SRVE_CDM_CASHUNITINFOCHANGED");
                break;
            case 305:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_RETRACT" : "");
                element.setDescription( "Evento: WFS_SRVE_CDM_TELLERINFOCHANGED");
                break;
            case 306:
                element.setErrorCode( bExecute ? "" : "WFS_INF_CDM_CURRENCY_EXP");
                element.setDescription( "Evento: WFS_EXEE_CDM_DELAYEDDISPENSE");
                break;
            case 307:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_OPEN_SHUTTER" : "WFS_INF_CDM_MIX_TYPES");
                element.setDescription( "Evento: WFS_EXEE_CDM_STARTDISPENSE");
                break;
            case 308:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_CLOSE_SHUTTER" : "WFS_INF_CDM_MIX_TABLE");
                element.setDescription( "Evento: WFS_EXEE_CDM_CASHUNITERROR");
                break;
            case 309:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_SET_TELLER_INFO" : "WFS_INF_CDM_PRESENT_STATUS");
                element.setDescription( "Evento: WFS_SRVE_CDM_ITEMSTAKEN");
                break;
            case 310:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_SET_CASH_UNIT_INFO" : "WFS_INF_CDM_GET_ITEM_INFO");
                element.setDescription( "Evento: WFS_EXEE_CDM_PARTIALDISPENSE");
                break;
            case 311:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_START_EXCHANGE" : "WFS_INF_CDM_GET_BLACKLIST");
                element.setDescription( "Evento: WFS_EXEE_CDM_SUBDISPENSEOK");
                break;
            case 312:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_END_EXCHANGE" : "WFS_INF_CDM_GET_ALL_ITEMS_INFO");
                element.setDescription( "");
                break;
            case 313:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_OPEN_SAFE_DOOR" : "");
                element.setDescription( "Evento: WFS_SRVE_CDM_ITEMSPRESENTED");
                break;
            case 314:
                element.setErrorCode( bExecute ? "" : "");
                element.setDescription( "Evento: WFS_SRVE_CDM_COUNTS_CHANGED");
                break;
            case 315:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_CALIBRATE_CASH_UNIT" : "");
                element.setDescription( "Evento: WFS_EXEE_CDM_INCOMPLETEDISPENSE");
                break;
            case 316:
                element.setErrorCode( bExecute ? "" : "");
                element.setDescription( "Evento: WFS_EXEE_CDM_NOTEERROR");
                break;
            case 317:
                element.setErrorCode( bExecute ? "" : "");
                element.setDescription( "Evento: WFS_SRVE_CDM_MEDIADETECTED");
                break;
            case 318:
                element.setErrorCode( bExecute ? "" : "");
                element.setDescription( "Evento: WFS_EXEE_CDM_INPUT_P6");
                break;
            case 319:
                element.setErrorCode("");
                element.setDescription( "Evento: WFS_SRVE_CDM_DEVICEPOSITION");
                break;
            case 320:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_SET_MIX_TABLE" : "");
                element.setDescription( "Evento: WFS_SRVE_CDM_POWER_SAVE_CHANGE");
                break;
            case 321:
                element.setErrorCode( bExecute ? "WFS_CMD_CDM_RESET" : "");
                element.setDescription( "Evento: WFS_EXEE_CDM_INFO_AVAILABLE");
                break;
            case 322:
                element.setErrorCode(bExecute ? "WFS_CMD_CDM_TEST_CASH_UNITS" : "");
                element.setDescription( "Evento: WFS_EXEE_CDM_INCOMPLETERETRACT");
                break;
            case 323:
                element.setErrorCode(bExecute ? "WFS_CMD_CDM_COUNT" : "");
                element.setDescription( "Evento: WFS_SRVE_CDM_SHUTTERSTATUSCHANGED");
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
                element.setDescription( "Evento: WFS_EXEE_PIN_KEY");
                break;
            case 402:
                element.setErrorCode( bExecute ? "" : "WFS_INF_PIN_CAPABILITIES");
                element.setDescription( "Evento: WFS_SRVE_PIN_INITIALIZED");
                break;
            case 403:
                element.setErrorCode( bExecute ? "WFS_CMD_PIN_IMPORT_KEY" : "");
                element.setDescription( "Evento: WFS_SRVE_PIN_ILLEGAL_KEY_ACCESS");
                break;
            case 404:
                element.setErrorCode( bExecute ? "" : "WFS_INF_PIN_KEY_DETAIL");
                element.setDescription( "Evento: WFS_SRVE_PIN_OPT_REQUIRED");
                break;
            case 405:
                element.setErrorCode( bExecute ? "WFS_CMD_PIN_GET_PIN" : "WFS_INF_PIN_FUNCKEY_DETAIL");
                element.setDescription( "Evento: WFS_SRVE_PIN_HSM_TDATA_CHANGED");
                break;
            case 406:
                element.setErrorCode( bExecute ? "" : "WFS_INF_PIN_HSM_TDATA");
                element.setDescription( "Evento: WFS_SRVE_PIN_CERTIFICATE_CHANGE");
                break;
            case 407:
                element.setErrorCode( bExecute ? "WFS_CMD_PIN_GET_PINBLOCK" : "WFS_INF_PIN_KEY_DETAIL_EX");
                element.setDescription( "Evento: WFS_SRVE_PIN_HSM_CHANGED");
                break;
            case 408:
                element.setErrorCode( bExecute ? "WFS_CMD_PIN_GET_DATA" : "WFS_INF_PIN_SECUREKEY_DETAIL");
                element.setDescription( "Evento: WFS_EXEE_PIN_ENTERDATA");
                break;
            case 409:
                element.setErrorCode( bExecute ? "WFS_CMD_PIN_INITIALIZATION" : "WFS_INF_PIN_QUERY_LOGICAL_HSM_DETAIL");
                element.setDescription( "Evento: WFS_SRVE_PIN_DEVICEPOSITION");
                break;
            case 410:
                element.setErrorCode( bExecute ? "WFS_CMD_PIN_LOCAL_DES" : "WFS_INF_PIN_QUERY_PCIPTS_DEVICE_ID");
                element.setDescription( "Evento: WFS_SRVE_PIN_POWER_SAVE_CHANGE");
                break;
            case 411:
                element.setErrorCode( bExecute ? "WFS_CMD_PIN_LOCAL_EUROCHEQUE" : "WFS_INF_PIN_GET_LAYOUT");
                element.setDescription( "Evento: WFS_EXEE_PIN_LAYOUT");
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
                element.setDescription( "Evento: WFS_SRVE_DEP_ENVTAKEN");
                break;
            case 602:
                element.setErrorCode( bExecute ? "WFS_CMD_DEP_DISPENSE" : "WFS_INF_DEP_CAPABILITIES");
                element.setDescription( "Evento: WFS_EXEE_DEP_ENVDEPOSITED");
                break;
            case 603:
                element.setErrorCode( bExecute ? "WFS_CMD_DEP_RETRACT" : "");
                element.setDescription( "Evento: WFS_EXEE_DEP_DEPOSITERROR");
                break;
            case 604:
                element.setErrorCode( bExecute ? "" : "");
                element.setDescription( "Evento: WFS_USRE_DEP_DEPTHRESHOLD");
                break;
            case 605:
                element.setErrorCode( bExecute ? "WFS_CMD_DEP_RESET_COUNT" : "");
                element.setDescription( "Evento: WFS_USRE_DEP_TONERTHRESHOLD");
                break;
            case 606:
                element.setErrorCode( bExecute ? "WFS_CMD_DEP_RESET" : "");
                element.setDescription( "Evento: WFS_USRE_DEP_ENVTHRESHOLD");
                break;
            case 607:
                element.setErrorCode( bExecute ? "WFS_CMD_DEP_SET_GUIDANCE_LIGHT" : "");
                element.setDescription( "Evento: WFS_SRVE_DEP_CONTINSERTED");
                break;
            case 608:
                element.setErrorCode( bExecute ? "WFS_CMD_DEP_SUPPLY_REPLENISH" : "");
                element.setDescription( "Evento: WFS_SRVE_DEP_CONTREMOVED");
                break;
            case 609:
                element.setErrorCode( bExecute ? "WFS_CMD_DEP_POWER_SAVE_CONTROL" : "");
                element.setDescription( "Evento: WFS_SRVE_DEP_ENVINSERTED");
                break;
            case 610:
                element.setErrorCode( bExecute ? "WFS_CMD_DEP_SYNCHRONIZE_COMMAND" : "");
                element.setDescription( "Evento: WFS_SRVE_DEP_MEDIADETECTED");
                break;
            case 611:
                element.setErrorCode( bExecute ? "" : "");
                element.setDescription( "Evento: WFS_EXEE_DEP_INSERTDEPOSIT");
                break;
            case 612:
                element.setErrorCode( bExecute ? "" : "");
                element.setDescription( "Evento: WFS_SRVE_DEP_DEVICEPOSITION");
                break;
            case 613:
                element.setErrorCode( bExecute ? "" : "");
                element.setDescription( "Evento: WFS_SRVE_DEP_POWER_SAVE_CHANGE");
                break;

            ///////////////////////////////////////
            //Comandos y eventos de TTU
            case 701:
                element.setErrorCode( bExecute ? "WFS_CMD_TTU_BEEP" : "WFS_INF_TTU_STATUS");
                element.setDescription( "Evento: WFS_EXEE_TTU_FIELDERROR");
                break;
            case 702:
                element.setErrorCode( bExecute ? "WFS_CMD_TTU_CLEARSCREEN" : "WFS_INF_TTU_CAPABILITIES");
                element.setDescription( "Evento: WFS_EXEE_TTU_FIELDWARNING");
                break;
            case 703:
                element.setErrorCode( bExecute ? "WFS_CMD_TTU_DISPLIGHT" : "WFS_INF_TTU_FORM_LIST");
                element.setDescription( "Evento: WFS_EXEE_TTU_KEY");
                break;
            case 704:
                element.setErrorCode( bExecute ? "WFS_CMD_TTU_SET_LED" : "WFS_INF_TTU_QUERY_FORM");
                element.setDescription( "Evento: WFS_SRVE_TTU_DEVICEPOSITION");
                break;
            case 705:
                element.setErrorCode( bExecute ? "WFS_CMD_TTU_SET_RESOLUTION" : "WFS_INF_TTU_QUERY_FIELD");
                element.setDescription( "Evento: WFS_SRVE_TTU_POWER_SAVE_CHANGE");
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
                element.setDescription( "Evento: WFS_SRVE_SIU_PORT_STATUS");
                break;
            case 802:
                element.setErrorCode( bExecute ? "WFS_CMD_SIU_SET_PORTS" : "WFS_INF_SIU_CAPABILITIES");
                element.setDescription( "Evento: WFS_EXEE_SIU_PORT_ERROR");
                break;
            case 803:
                element.setErrorCode( bExecute ? "WFS_CMD_SIU_SET_DOOR" : "WFS_INF_SIU_GET_AUTOSTARTUP_TIME");
                element.setDescription( "Evento: WFS_SRVE_SIU_POWER_SAVE_CHANGE");
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
                element.setDescription( "Evento: WFS_SRVE_VDM_ENTER_MODE_REQ");
                break;
            case 902:
                element.setErrorCode( bExecute ? "WFS_CMD_VDM_ENTER_MODE_ACK" : "WFS_INF_VDM_CAPABILITIES");
                element.setDescription( "Evento: WFS_SRVE_VDM_EXIT_MODE_REQ");
                break;
            case 903:
                element.setErrorCode( bExecute ? "WFS_CMD_VDM_EXIT_MODE_REQ" : "WFS_INF_VDM_ACTIVE_INTERFACE");
                element.setDescription( "Evento: WFS_SYSE_VDM_MODEENTERED");
                break;
            case 904:
                element.setErrorCode( bExecute ? "WFS_CMD_VDM_EXIT_MODE_ACK" : "");
                element.setDescription( "Evento: WFS_SYSE_VDM_MODEEXITED");
                break;
            case 905:
                element.setErrorCode( bExecute ? "WFS_CMD_VDM_SET_ACTIVE_INTERFACE" : "");
                element.setDescription( "Evento: WFS_SRVE_VDM_INTERFACE_CHANGED");
                break;

            ///////////////////////////////////////
            //Comandos y eventos del Ingresador de efectivo
            case 1301:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_CASH_IN_START" : "WFS_INF_CIM_STATUS");
                element.setDescription( "Evento: WFS_SRVE_CIM_SAFEDOOROPEN");
                break;
            case 1302:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_CASH_IN" : "WFS_INF_CIM_CAPABILITIES");
                element.setDescription( "Evento: WFS_SRVE_CIM_SAFEDOORCLOSED");
                break;
            case 1303:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_CASH_IN_END" : "WFS_INF_CIM_CASH_UNIT_INFO");
                element.setDescription( "Evento: WFS_USRE_CIM_CASHUNITTHRESHOLD");
                break;
            case 1304:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_CASH_IN_ROLLBACK" : "WFS_INF_CIM_TELLER_INFO");
                element.setDescription( "Evento: WFS_SRVE_CIM_CASHUNITINFOCHANGED");
                break;
            case 1305:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_RETRACT" : "WFS_INF_CIM_CURRENCY_EXP");
                element.setDescription( "Evento: WFS_SRVE_CIM_TELLERINFOCHANGED");
                break;
            case 1306:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_OPEN_SHUTTER" : "WFS_INF_CIM_BANKNOTE_TYPES");
                element.setDescription( "Evento: WFS_EXEE_CIM_CASHUNITERROR");
                break;
            case 1307:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_CLOSE_SHUTTER" : "WFS_INF_CIM_CASH_IN_STATUS");
                element.setDescription( "Evento: WFS_SRVE_CIM_ITEMSTAKEN");
                break;
            case 1308:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_SET_TELLER_INFO" : "WFS_INF_CIM_GET_P6_INFO");
                element.setDescription( "Evento: WFS_SRVE_CIM_COUNTS_CHANGED");
                break;
            case 1309:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_SET_CASH_UNIT_INFO" : "WFS_INF_CIM_GET_P6_SIGNATURE");
                element.setDescription( "Evento: WFS_EXEE_CIM_INPUTREFUSE");
                break;
            case 1310:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_START_EXCHANGE" : "WFS_INF_CIM_GET_ITEM_INFO");
                element.setDescription( "Evento: WFS_SRVE_CIM_ITEMSPRESENTED");
                break;
            case 1311:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_END_EXCHANGE" : "WFS_INF_CIM_POSITION_CAPABILITIES");
                element.setDescription( "Evento: WFS_SRVE_CIM_ITEMSINSERTED");
                break;
            case 1312:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_OPEN_SAFE_DOOR" : "WFS_INF_CIM_REPLENISH_TARGET");
                element.setDescription( "Evento: WFS_EXEE_CIM_NOTEERROR");
                break;
            case 1313:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_RESET" : "WFS_INF_CIM_DEVICELOCK_STATUS");
                element.setDescription( "Evento: WFS_EXEE_CIM_SUBCASHIN");
                break;
            case 1314:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_CONFIGURE_CASH_IN_UNITS" : "WFS_INF_CIM_CASH_UNIT_CAPABILITIES");
                element.setDescription( "Evento: WFS_SRVE_CIM_MEDIADETECTED");
                break;
            case 1315:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_CONFIGURE_NOTETYPES" : "WFS_INF_CIM_DEPLETE_SOURCE");
                element.setDescription( "Evento: WFS_EXEE_CIM_INPUT_P6");
                break;
            case 1316:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_CREATE_P6_SIGNATURE" : "WFS_INF_CIM_GET_ALL_ITEMS_INFO");
                element.setDescription( "Evento: WFS_EXEE_CIM_INFO_AVAILABLE");
                break;
            case 1317:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_SET_GUIDANCE_LIGHT" : "WFS_INF_CIM_GET_BLACKLIST");
                element.setDescription( "Evento: WFS_EXEE_CIM_INSERTITEMS");
                break;
            case 1318:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_CONFIGURE_NOTE_READER" : "");
                element.setDescription( "Evento: WFS_SRVE_CIM_DEVICEPOSITION");
                break;
            case 1319:
                element.setErrorCode(bExecute ? "WFS_CMD_CIM_COMPARE_P6_SIGNATURE" : "");
                element.setDescription( "Evento: WFS_SRVE_CIM_POWER_SAVE_CHANGE");
                break;
            case 1320:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_POWER_SAVE_CONTROL" : "");
                element.setDescription( "Evento: WFS_EXEE_CIM_INCOMPLETEREPLENISH");
                break;
            case 1321:
                element.setErrorCode( bExecute ? "WFS_CMD_CIM_REPLENISH" : "");
                element.setDescription( "Evento: WFS_EXEE_CIM_INCOMPLETEDEPLETE");
                break;
            case 1322:
                element.setErrorCode(bExecute ? "WFS_CMD_CIM_SET_CASH_IN_LIMIT" : "");
                element.setDescription( "Evento: WFS_SRVE_CIM_SHUTTERSTATUSCHANGED");
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
                element.setDescription( "Evento: WFS_SRVE_BCR_DEVICEPOSITION");
                break;
            case 1502:
                element.setErrorCode( bExecute ? "WFS_CMD_BCR_RESET" : "WFS_INF_BCR_CAPABILITIES");
                element.setDescription( "Evento: WFS_SRVE_BCR_POWER_SAVE_CHANGE");
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
}
