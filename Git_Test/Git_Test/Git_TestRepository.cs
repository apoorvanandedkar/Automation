﻿///////////////////////////////////////////////////////////////////////////////
//
// This file was automatically generated by RANOREX.
// DO NOT MODIFY THIS FILE! It is regenerated by the designer.
// All your modifications will be lost!
// http://www.ranorex.com
//
///////////////////////////////////////////////////////////////////////////////

using System;
using System.Collections.Generic;
using System.Text;
using System.Drawing;
using Ranorex;
using Ranorex.Core;
using Ranorex.Core.Repository;
using Ranorex.Core.Testing;

namespace Git_Test
{
#pragma warning disable 0436 //(CS0436) The type 'type' in 'assembly' conflicts with the imported type 'type2' in 'assembly'. Using the type defined in 'assembly'.
    /// <summary>
    /// The class representing the Git_TestRepository element repository.
    /// </summary>
    [System.CodeDom.Compiler.GeneratedCode("Ranorex", "8.0")]
    [RepositoryFolder("df605698-614d-4557-ac6b-31166777ba86")]
    public partial class Git_TestRepository : RepoGenBaseFolder
    {
        static Git_TestRepository instance = new Git_TestRepository();

        /// <summary>
        /// Gets the singleton class instance representing the Git_TestRepository element repository.
        /// </summary>
        [RepositoryFolder("df605698-614d-4557-ac6b-31166777ba86")]
        public static Git_TestRepository Instance
        {
            get { return instance; }
        }

        /// <summary>
        /// Repository class constructor.
        /// </summary>
        public Git_TestRepository() 
            : base("Git_TestRepository", "/", null, 0, false, "df605698-614d-4557-ac6b-31166777ba86", ".\\RepositoryImages\\Git_TestRepositorydf605698.rximgres")
        {
        }

#region Variables

#endregion

        /// <summary>
        /// The Self item info.
        /// </summary>
        [RepositoryItemInfo("df605698-614d-4557-ac6b-31166777ba86")]
        public virtual RepoItemInfo SelfInfo
        {
            get
            {
                return _selfInfo;
            }
        }
    }

    /// <summary>
    /// Inner folder classes.
    /// </summary>
    [System.CodeDom.Compiler.GeneratedCode("Ranorex", "8.0")]
    public partial class Git_TestRepositoryFolders
    {
    }
#pragma warning restore 0436
}