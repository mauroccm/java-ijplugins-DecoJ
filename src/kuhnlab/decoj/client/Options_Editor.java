//   Copyright 2013 Jeffrey R. Kuhn
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.

package kuhnlab.decoj.client;


import ij.plugin.*;
import ij.*;
import java.lang.*;
import java.util.*;

public class Options_Editor implements PlugIn {
    public void run(String arg) {
        DecoOptions options = new DecoOptions();
        DecoOptionsDlg dlg = new DecoOptionsDlg(IJ.getInstance(), options, false);
        dlg.show();
    }
}
