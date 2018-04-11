/*
 * Created by Ranorex
 * User: Lenovo
 * Date: 4/11/2018
 * Time: 8:51 PM
 * 
 * To change this template use Tools > Options > Coding > Edit standard headers.
 */
using System;
using System.Collections.Generic;
using System.Text;
using System.Text.RegularExpressions;
using System.Drawing;
using System.Threading;
using WinForms = System.Windows.Forms;

using Ranorex;
using Ranorex.Core;
using Ranorex.Core.Testing;

namespace Test
{
    /// <summary>
    /// Description of TestCodeModule.
    /// </summary>
    [TestModule("62F322C3-EE9B-4538-A6CD-DA54E54A6101", ModuleType.UserCode, 1)]
    public class TestCodeModule : ITestModule
    {
        /// <summary>
        /// Constructs a new instance.
        /// </summary>
        public TestCodeModule()
        {
            // Do not delete - a parameterless constructor is required!
        }

        /// <summary>
        /// Performs the playback of actions in this module.
        /// </summary>
        /// <remarks>You should not call this method directly, instead pass the module
        /// instance to the <see cref="TestModuleRunner.Run(ITestModule)"/> method
        /// that will in turn invoke this method.</remarks>
        void ITestModule.Run()
        {
            Mouse.DefaultMoveTime = 300;
            Keyboard.DefaultKeyPressTime = 100;
            Delay.SpeedFactor = 1.0;
        
            var repo = TestRepository.Instance;
            var google = repo.Google;

            var lstIb = repo.Google.LstIb;
            lstIb.Click();

        }
    }
}
