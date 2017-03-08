package com.box.l10n.mojito.cli.filefinder.file;

import static com.box.l10n.mojito.cli.filefinder.FilePattern.BASE_NAME;
import static com.box.l10n.mojito.cli.filefinder.FilePattern.DOT;
import static com.box.l10n.mojito.cli.filefinder.FilePattern.FILE_EXTENSION; 
import static com.box.l10n.mojito.cli.filefinder.FilePattern.LOCALE;
import static com.box.l10n.mojito.cli.filefinder.FilePattern.PARENT_PATH;
import static com.box.l10n.mojito.cli.filefinder.FilePattern.PATH_SEPERATOR;
import static com.box.l10n.mojito.cli.filefinder.FilePattern.SUB_PATH;
import com.box.l10n.mojito.cli.filefinder.locale.POLocaleType;

/**
 *
 * @author jaurambault
 */
public class POFileType extends FileType {

    public POFileType() {
        this.fileExtension = "pot";
        this.targetFileExtension = "po";
        this.subPath = "LC_MESSAGES";
        this.sourceFilePatternTemplate = "{" + PARENT_PATH + "}" + "{" + BASE_NAME + "}" + DOT + "{" + FILE_EXTENSION + "}";
        this.targetFilePatternTemplate = "{" + PARENT_PATH + "}" + "{" + LOCALE + "}" + PATH_SEPERATOR + "{" + SUB_PATH + "}" + PATH_SEPERATOR + "{" + BASE_NAME + "}" + DOT + "{" + FILE_EXTENSION + "}";
        this.localeType = new POLocaleType();
    }

}
