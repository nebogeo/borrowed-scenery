 /** 
 ** Copyright (c) 2010 Boskoi
 ** All rights reserved
 ** Contact: developer@boskoi.org
 ** Developers: Joey van der Bie, Maarten van der Mark and Vincent Vijn
 ** Website: http://www.boskoi.org
 ** 
 ** GNU Lesser General Public License Usage
 ** This file may be used under the terms of the GNU Lesser
 ** General Public License version 3 as published by the Free Software
 ** Foundation and appearing in the file LICENSE.LGPL included in the
 ** packaging of this file. Please review the following information to
 ** ensure the GNU Lesser General Public License version 3 requirements
 ** will be met: http://www.gnu.org/licenses/lgpl.html.	
 **	
 **
 ** If you have questions regarding the use of this file, please contact
 ** Boskoi developers at developer@boskoi.org.
 ** 
 **/

package foam.zizim.android;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;

public class DialogPreference extends android.preference.DialogPreference {
  public DialogPreference(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public DialogPreference(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
  }
  
  @Override
  public void onClick(DialogInterface dialog, int which) {
    super.onClick(dialog, which);

    if (which == DialogInterface.BUTTON_POSITIVE) {
      new BoskoiService().clearCache();
    } 
  }
}
